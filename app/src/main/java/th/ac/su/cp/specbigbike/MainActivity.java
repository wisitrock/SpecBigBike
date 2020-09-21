package th.ac.su.cp.specbigbike;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.specbigbike.model.BigBikeItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // สร้าง Layout Manager Object
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        // สร้าง Adapter Object
        MyAdapter adapter = new MyAdapter();
        //เจ้าถึง RecyclerView  กับ Layout
        RecyclerView rv = findViewById(R.id.bigbike_list_recycle_view);
        rv.setLayoutManager(lm);//กำหนด layout manager ให้กับ RecyclerView
        rv.setAdapter(adapter);//กำหนด  Adapter ให้กับRecyclerView
    }

}
class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {
    BigBikeItem[]items={
            new  BigBikeItem(R.drawable.apriliarsv4rr2020,"APRILIA","RSV4RR 2020"),
            new  BigBikeItem(R.drawable.ducativ4r,"DUCATI","V4R"),
            new  BigBikeItem(R.drawable.yamahar1m,"YAMAHA","R1M 2020"),
            new  BigBikeItem(R.drawable.harleydavidson48,"HARLEYDAVIDSON","FORTY-EIGHT"),
            new  BigBikeItem(R.drawable.hondacbr1000rr,"HONDA","CBR1000RR"),
            new  BigBikeItem(R.drawable.kawasakizx10r,"KAWASAKI","ZX10R"),
            new  BigBikeItem(R.drawable.s1000rr2020,"BMW","S1000RR 2020"),
            new  BigBikeItem(R.drawable.suzukigsxr1000,"SUZUKI","GSX-R1000"),
            new  BigBikeItem(R.drawable.triumphspeedtriplers,"TRIUMPH","SPEEDTRIPLERS"),
            new  BigBikeItem(R.drawable.ktm1190rc8r,"KTM","RC8R 1190"),


    };
    public MyAdapter() {
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bigbike_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(items[position].imageResId);
        holder.brandTextView.setText(items[position].brand);
        holder.modelTextView.setText(items[position].model);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView brandTextView;
        TextView modelTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            brandTextView = itemView.findViewById(R.id.textView_brand);
            modelTextView = itemView.findViewById(R.id.textView_model);
        }
    }
}