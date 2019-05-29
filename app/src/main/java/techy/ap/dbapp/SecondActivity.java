package techy.ap.dbapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.Toast;

import java.util.ArrayList;

import techy.ap.dbapp.Adapter.RecycleViewAdapter;
import techy.ap.dbapp.Database.Database;
import techy.ap.dbapp.Model.Docs;

public class SecondActivity extends AppCompatActivity {
    Database db;
    RecyclerView recyclerView;
    RecycleViewAdapter recycleViewAdapter;
  ArrayList<Docs> docsArrayList;
  ListAdapter arrayAdapter;
  Docs docs;
    private View.OnClickListener onItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO: Step 4 of 4: Finally call getTag() on the view.
            // This viewHolder will have all required values.
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) view.getTag();
            int position = viewHolder.getAdapterPosition();
            // viewHolder.getItemId();
            // viewHolder.getItemViewType();
            // viewHolder.itemView;
            Docs thisItem = docsArrayList.get(position);
            Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
            intent.putExtra("docsName",thisItem.getName());
            startActivity(intent);

            Toast.makeText(SecondActivity.this, "You Clicked: " + thisItem.getName(), Toast.LENGTH_SHORT).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        db=new Database(this);

        docsArrayList=db.getAllDocsDetail();


        recyclerView=findViewById(R.id.recycleview);

       RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
       recyclerView.setLayoutManager(layoutManager);

       recycleViewAdapter=new RecycleViewAdapter(docsArrayList);
       recyclerView.setAdapter(recycleViewAdapter);
       recycleViewAdapter.setOnItemClickListener(onItemClickListener);

     /*  recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
           @Override
           public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {




               return false;

           }

           @Override
           public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

           }

           @Override
           public void onRequestDisallowInterceptTouchEvent(boolean b) {

           }
       });
*/


    }
}
