package id.ac.polinema.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.ac.polinema.recyclerview.R;
import id.ac.polinema.recyclerview.models.TeamLatihan;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class LatihanAdapter extends RecyclerView.Adapter<LatihanAdapter.ViewHolder>{
    private Context context;
    private List<TeamLatihan> ket;

    private static final int LOGO_LEFT = 1;
    private  static final int LOGO_RIGHT =2;

    public LatihanAdapter(Context context,  List<TeamLatihan> ket) {
        this.context = context;
        this.ket = ket;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;

        if (viewType == LOGO_LEFT){
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan, parent, false);
        }
        else if(viewType == LOGO_RIGHT){
            view = LayoutInflater.from(context).inflate(R.layout.item_latihan_reversed, parent, false);
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LatihanAdapter.ViewHolder holder, int position) {
        TeamLatihan kete = ket.get(position);
        holder.keteranganText.setText(kete.getKeterangan());
        holder.nameText.setText(kete.getName());
        Picasso.get().load(kete.getLogo()).into(holder.logoImage);
    }

    @Override
    public int getItemCount() {
            return (ket != null) ? ket.size() : 0;
    }

    @Override
    public  int getItemViewType(int position){
        return (position % 4 == 0 || position % 4 == 3) ? LOGO_RIGHT : LOGO_LEFT;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImage;
        TextView nameText;
        TextView keteranganText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoImage = itemView.findViewById(R.id.image_logo);
            nameText = itemView.findViewById(R.id.text_name);
            keteranganText = itemView.findViewById(R.id.text_keterangan);
        }
    }
}
