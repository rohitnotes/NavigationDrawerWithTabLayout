package navigation.drawer.with.tab.layout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listOfFragment = new ArrayList<>();
    List<String> listOfTabTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    public void addFragment(Fragment fragment,String title)
    {
        listOfFragment.add(fragment);
        listOfTabTitle.add(title);
    }
    //Needed for
    @Override
    public CharSequence getPageTitle(int position) {
        return listOfTabTitle.get(position);
    }
    @Override
    public Fragment getItem(int position) {
        return listOfFragment.get(position);
    }
    @Override
    public int getCount() {
        return listOfFragment.size();
    }
}
