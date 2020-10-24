package recyerviewstudy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.test07.LieBiaoActivity;
import com.example.test07.R;

public class RecycleListActivity extends AppCompatActivity {

    RecyclerView myRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycle_list);

        myRecyclerView = findViewById(R.id.recycletest_01);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleListActivity.this));
        myRecyclerView.setAdapter(new CustomRecycelLayout(RecycleListActivity.this));
    }
}