package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerview.adapters.GridAdapter;
import id.ac.polinema.recyclerview.adapters.LogoAdapter;
import id.ac.polinema.recyclerview.adapters.ReversedLogoAdapter;
import id.ac.polinema.recyclerview.models.TeamLogo;

public class ViewTypeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_type);
		RecyclerView teamsView = findViewById(R.id.rv_teams);

		List<TeamLogo> teams = new ArrayList<>();
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/0/0c/Liverpool_FC.svg/360px-Liverpool_FC.svg.png", "Liverpool"));
		teams.add(new TeamLogo("https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Manchester_City_FC_badge.svg/360px-Manchester_City_FC_badge.svg.png", "Man. City"));
		teams.add(new TeamLogo("https://pngimg.com/uploads/fcb_logo/fcb_logo_PNG23.png", "Barcelona"));

		ReversedLogoAdapter adapter = new ReversedLogoAdapter(this, teams);
		teamsView.setAdapter(adapter);

		RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);
		teamsView.setLayoutManager(layoutManager);
	}
}
