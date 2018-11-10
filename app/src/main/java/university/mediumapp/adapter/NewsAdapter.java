package university.mediumapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import university.mediumapp.R;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.RecyclerViewHolder> {
    private List<String> data = new ArrayList<>();

    public NewsAdapter() {
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_news, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtType,txtAuthor,txtTitle,txtPublic,txtTimeRead;
        Button btnBookMark;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            txtType = (TextView) itemView.findViewById(R.id.news_title);
            txtTitle = (TextView) itemView.findViewById(R.id.news_title);
            txtAuthor = (TextView) itemView.findViewById(R.id.news_author_name);
            txtPublic = (TextView) itemView.findViewById(R.id.news_publish_date);
            txtTimeRead = (TextView) itemView.findViewById(R.id.news_time_read);
            btnBookMark = (Button) itemView.findViewById(R.id.news_btn_bookmark);

        }
    }
}
