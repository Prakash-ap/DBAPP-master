package techy.ap.dbapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

import techy.ap.dbapp.Model.Docs;
import techy.ap.dbapp.R;
import techy.ap.dbapp.RecyclerViewClickListener;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Docs> mdocs;
    private RecyclerViewClickListener mrecyclerViewClickListener;
    private View.OnClickListener mOnItemClickListener;


    public RecycleViewAdapter(ArrayList<Docs> mdocs) {
        this.mdocs = mdocs;
    }

    @NonNull
    @Override
    public RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.childview, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.MyViewHolder myViewHolder, int i) {

        Docs docs = mdocs.get(i);
        myViewHolder.name.setText(docs.getName());
        myViewHolder.specialist.setText(docs.getSpecialist());


    }

    @Override
    public int getItemCount() {
        return mdocs.size();
    }


    public void setOnItemClickListener(View.OnClickListener itemClickListener) {
        mOnItemClickListener = itemClickListener;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name, specialist;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);
            name = (TextView) itemView.findViewById(R.id.text1);
            specialist = (TextView) itemView.findViewById(R.id.text2);
            itemView.setTag(this);
            itemView.setOnClickListener(mOnItemClickListener);

        }


    }


    /*@NonNull
    @Override
    public RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context=viewGroup.getContext();

        View v= LayoutInflater.from(context).inflate(R.layout.childview,viewGroup,false);
        return new MyViewHolder(v,mrecyclerViewClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewAdapter.MyViewHolder myViewHolder, int i) {

        Docs docstabel=docs.get(i);

        myViewHolder.name.setText(docstabel.getName());
        myViewHolder.specialist.setText(docstabel.getSpecialist());



    }

    @Override
    public int getItemCount() {
        return docs.size();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



*//*

        Docs docstabels=docs.get(position);
        Intent intent=new Intent(context,ThirdActivity.class);
        intent.putExtra("postion", String.valueOf(docstabels));
        intent.putExtra("name",docstabels.getName());
        context.startActivity(intent);
*//*

    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView name,specialist;

        private RecyclerViewClickListener mrecyclerViewClickListener;

        public MyViewHolder(@NonNull View itemView,RecyclerViewClickListener recyclerViewClickListener) {
            super(itemView);
            mrecyclerViewClickListener=recyclerViewClickListener;

            name=(TextView)itemView.findViewById(R.id.text1);
            specialist=(TextView)itemView.findViewById(R.id.text2);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            mrecyclerViewClickListener.onClick(v,getAdapterPosition());


        }
    }*/
}
