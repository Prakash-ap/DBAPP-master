package techy.ap.dbapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import techy.ap.dbapp.Adapter.BookingAdapter;
import techy.ap.dbapp.Adapter.RecycleViewAdapter;
import techy.ap.dbapp.Database.Database;
import techy.ap.dbapp.Model.Booking;

public class FourthActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Database db;
    private ArrayList<Booking>bookingArrayList;
    private View.OnClickListener itemselected=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        RecyclerView.ViewHolder viewHolder=(RecyclerView.ViewHolder)v.getTag();
        int pos=viewHolder.getAdapterPosition();
        Booking boks=bookingArrayList.get(pos);
            Toast.makeText(FourthActivity.this, "You Clicked: " + boks.getPatname(), Toast.LENGTH_SHORT).show();
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        db=new Database(this);
        bookingArrayList=db.getAllBooking();


        recyclerView=findViewById(R.id.secondrecycleview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        BookingAdapter bookingAdapter=new BookingAdapter(bookingArrayList);
        recyclerView.setAdapter(bookingAdapter);
        bookingAdapter.setsecondItemClicListener(itemselected);
    }
}
