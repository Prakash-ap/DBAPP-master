package techy.ap.dbapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import techy.ap.dbapp.Model.Booking;
import techy.ap.dbapp.R;

public class BookingAdapter extends RecyclerView.Adapter<BookingAdapter.MyViewHolder> {

    private ArrayList<Booking>bookingArrayList;
    private View.OnClickListener onClickListener;

    public BookingAdapter(ArrayList<Booking> bookingArrayList) {
        this.bookingArrayList = bookingArrayList;
    }

    @NonNull
    @Override
    public BookingAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.secondrecycle_child_layout,viewGroup,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingAdapter.MyViewHolder myViewHolder, int i) {
        Booking booking=bookingArrayList.get(i);
        myViewHolder.docname.setText(booking.getDocsname());
        myViewHolder.paname.setText(booking.getPatname());
        myViewHolder.patphone.setText(booking.getPhonenumber());
        myViewHolder.date.setText(booking.getDate());
        myViewHolder.time.setText(booking.getTime());
     /*   booking.setDocsname(booking.getDocsname());
        booking.setPatname(booking.getPatname());
        booking.setPhonenumber(booking.getPhonenumber());
        booking.setDate(booking.getDate());
        booking.setTime(booking.getTime());*/


    }

    @Override
    public int getItemCount() {
        return bookingArrayList.size();
    }

    public void setsecondItemClicListener(View.OnClickListener onItemClickListener){
        onClickListener=onItemClickListener;

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView docname,paname,patphone,date,time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            docname=itemView.findViewById(R.id.docsname);
            paname=itemView.findViewById(R.id.paname);
            patphone=itemView.findViewById(R.id.patientphone);
            date=itemView.findViewById(R.id.patientdate);
            time=itemView.findViewById(R.id.patienttime);
            itemView.setOnClickListener(onClickListener);
        }
    }
}
