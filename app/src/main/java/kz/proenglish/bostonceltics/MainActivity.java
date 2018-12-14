package kz.proenglish.bostonceltics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    // ArrayList initialization
    List<Player> bostonCeltics = new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);

        bostonCeltics.add(new Player("Kyrie Irving", "23-Mar-92", 190.5, "Point guard", R.mipmap.irving, 0));
        bostonCeltics.add(new Player("Jayson Tatum", "3-Mar-98", 190.5, "Small forward", R.mipmap.tatum, 0));
        bostonCeltics.add(new Player("Gordon Hayward", "23-Mar-90", 203.2, "Small forward", R.mipmap.hayward, 0));
        bostonCeltics.add(new Player("Robert Williams", "17-Oct-97", 208.3, "Power forward", R.mipmap.williams, 0));
        bostonCeltics.add(new Player("Jabari Bird", "3-Jul-94", 198.1, "Shooting guard", R.mipmap.bird, 0));
        bostonCeltics.add(new Player("Al Horford", "3-Jun-86", 208.3, "Center / Power forward", R.mipmap.horford, 0));
        bostonCeltics.add(new Player("Jaylen Brown", "24-Oct-96", 200.7, "Small forward/ Shooting guard", R.mipmap.brown, 0));
        bostonCeltics.add(new Player("Marcus Smart", "6-Mar-94", 193.0, "Shooting guard / Point guard", R.mipmap.smart, 0));
        bostonCeltics.add(new Player("Terry Rozier", "17-Mar-94", 185.4, "Point guard", R.mipmap.rozier, 0));
        bostonCeltics.add(new Player("Aron Baynes", "9-Dec-86", 208.3, "Center / Power forward", R.mipmap.baynes, 0));
        bostonCeltics.add(new Player("Marcus Morris", "2-Sep-89", 205.7, "Forward", R.mipmap.morris, 0));
        bostonCeltics.add(new Player("Brad Wanamaker", "25-Jul-89", 193.0, "Point guard / Shooting guard", R.mipmap.wanamaker, 0));
        bostonCeltics.add(new Player("P. J. Dozier", "25-Oct-96", 198.1, "Shooting guard", R.mipmap.dozier, 0));
        bostonCeltics.add(new Player("Daniel Theis", "4-Apr-92", 203.2, "Center / Power forward", R.mipmap.theis, 0));
        bostonCeltics.add(new Player("Guerschon Yabusele", "17-Dec-95", 203.2, "Power forward", R.mipmap.yabusele, 0));
        bostonCeltics.add(new Player("Semi Ojeleye", "5-Dec-94", 200.7, "Forward", R.mipmap.ojeleye, 0));
        bostonCeltics.add(new Player("Walt Lemon Jr.", "26-Jul-92", 190.5, "Point guard", R.mipmap.lemon, 0));

        // test sout
        System.out.println("ArrayList: ");
        for (Player player:bostonCeltics) {
            System.out.println(player.getName());
        }

        // calling an ArrayAdapter
        TestAdapter bostonCelticsAdapter = new TestAdapter(this, bostonCeltics);

        listView.setAdapter(bostonCelticsAdapter);
    }

    // implementing method onItemClickListener
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // test sout
        System.out.println("Tapped " + position);

        // move from MainActivity to PlayerDetailActivity
        Intent moveToDetailIntent = new Intent(getBaseContext(), PlayerDetailActivity.class);
        moveToDetailIntent.putExtra("player", bostonCeltics.get(position));
        startActivity(moveToDetailIntent);
    }
}