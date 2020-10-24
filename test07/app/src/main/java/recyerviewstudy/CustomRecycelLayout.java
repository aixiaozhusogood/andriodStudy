package recyerviewstudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.test07.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecycelLayout extends RecyclerView.Adapter<CustomRecycelLayout.linearHolder> {

    private Context mycontext;
    public CustomRecycelLayout(Context context){
        this.mycontext = context;
    }

    @NonNull
    @Override
    public CustomRecycelLayout.linearHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new linearHolder(LayoutInflater.from(mycontext).inflate(R.layout.activity_customliner,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull linearHolder holder, int position) {

        holder.textview.setText("我爱你中国");

    }

//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//    }

    @Override
    public int getItemCount() {
        return 30;
    }

    class linearHolder extends RecyclerView.ViewHolder{

        private TextView textview;
        public linearHolder(View itemview){
            super(itemview);
            textview = itemview.findViewById(R.id.custom_01);
        }


    }
}
