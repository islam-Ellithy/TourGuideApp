package lamaatech.com.tourguideapp.ClubLayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import lamaatech.com.tourguideapp.ClubLayout.ClubContent.ClubItem;
import lamaatech.com.tourguideapp.ClubLayout.ClubFragment.OnListFragmentInteractionListener;
import lamaatech.com.tourguideapp.R;

class ClubRecyclerViewAdapter extends RecyclerView.Adapter<ClubRecyclerViewAdapter.ViewHolder> {

    private final List<ClubItem> mValues;
    private final OnListFragmentInteractionListener mListener;

    ClubRecyclerViewAdapter(List<ClubItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_club, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContentView.setText(mValues.get(position).clubName);
        holder.mIdView.setText(mValues.get(position).details);
        holder.mClubImage.setImageResource(mValues.get(position).clubImage);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
         final View mView;
         final TextView mIdView;
         final TextView mContentView;
         final ImageView mClubImage;
         ClubItem mItem;

        ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.details);
            mContentView = (TextView) view.findViewById(R.id.clubName);
            mClubImage = (ImageView)view.findViewById(R.id.clubImage);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
