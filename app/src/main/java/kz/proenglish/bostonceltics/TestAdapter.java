package kz.proenglish.bostonceltics;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

// creating an ArrayAdapter
public class TestAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater;
    ArrayList<Player> objects;

    TestAdapter(Context context, List<Player> players) {
        context = context;
        objects = new ArrayList<>();
        objects.addAll(players);
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    // quantity of elements
    @Override
    public int getCount() {
        return objects.size();
    }
    // position of element
    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }
    // position id
    @Override
    public long getItemId(int position) {
        return position;
    }
    // list position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // using the Views
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.adapter_item_player, parent, false);
        }
        Player p = getPlayer(position);
        // filling the View
        ((TextView) view.findViewById(R.id.name)).setText(p.getName());
        return view;
    }
    // Players position
    Player getPlayer(int position) {
        return ((Player) getItem(position));
    }
}
