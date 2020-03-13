package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.adapters.LatihanAdapter;
import id.ac.polinema.recyclerview.models.TeamLatihan;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class Latihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<TeamLatihan> kets = new ArrayList<>();
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool", "ini tim liverpool"));
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City", "ini tim man city"));
        kets.add(new TeamLatihan("https://pngimg.com/uploads/fcb_logo/fcb_logo_PNG23.png", "Barcelona", "ini team barcelona"));
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool", "ini tim liverpool"));
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool", "ini tim liverpool"));
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City", "ini tim man city"));
        kets.add(new TeamLatihan("https://pngimg.com/uploads/fcb_logo/fcb_logo_PNG23.png", "Barcelona", "ini team barcelona"));
        kets.add(new TeamLatihan("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool", "ini tim liverpool"));

        LatihanAdapter adapter = new LatihanAdapter(this, kets);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        teamsView.setLayoutManager(layoutManager);
    }
}
