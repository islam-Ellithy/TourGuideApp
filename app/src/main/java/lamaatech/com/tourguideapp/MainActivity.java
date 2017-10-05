package lamaatech.com.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import lamaatech.com.tourguideapp.ClubLayout.ClubFragment;
import lamaatech.com.tourguideapp.DrinkLayout.DrinkFragment;
import lamaatech.com.tourguideapp.HyperMarketLayout.HyberMarketFragment;
import lamaatech.com.tourguideapp.RestaurantLayout.RestaurantFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        goToResturantFragment();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_restaurant) {
            if (!checkIsCurrentFragmentShow(RestaurantFragment.class.getSimpleName()))
                goToResturantFragment();
        } else if (id == R.id.nav_coffe) {
            if (!checkIsCurrentFragmentShow(DrinkFragment.class.getSimpleName()))
                goToDrinkFragment();
        } else if (id == R.id.nav_club) {
            if (!checkIsCurrentFragmentShow(ClubFragment.class.getSimpleName()))
                goToClubFragment();
        } else if (id == R.id.nav_hypermarkets) {
            if (!checkIsCurrentFragmentShow(HyberMarketFragment.class.getSimpleName()))
                goToHyberMarketFragment();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean checkIsCurrentFragmentShow(String fragmentName) {
        return (getSupportFragmentManager().getClass().getSimpleName().equals(fragmentName));
    }

    void goToResturantFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, RestaurantFragment.newInstance(1))
                .commit();
    }

    void goToDrinkFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, DrinkFragment.newInstance(1))
                .commit();
    }


    void goToClubFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, ClubFragment.newInstance(1))
                .commit();
    }

    void goToHyberMarketFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_layout, HyberMarketFragment.newInstance(1))
                .commit();
    }
}
