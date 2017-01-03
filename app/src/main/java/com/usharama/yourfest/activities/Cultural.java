package com.usharama.yourfest.activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.usharama.yourfest.R;
import com.usharama.yourfest.models.Event;

import java.util.ArrayList;

public class Cultural extends AppCompatActivity {
    public static ArrayList<Event> events;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        events = new ArrayList<>();
        events.add(new Event(
                " Short Film contest",
                "<h4 class=\"text-center\">   Short Film contest</h4>\n" +
                        "                                        <p>\n" +
                        "                                            <strong><u>Short film Mania</u></strong>:&nbsp; Max. time limit is 10mins.</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp; Themes for Short Film contest :</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 1. Social issues</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 2. Anti corruption</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 3. Woman empowerment</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 4. Child labor</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 5. Advancement in Technology</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;</p>\n",
                R.drawable.short_films
        ));
        events.add(new Event(
                "Best Singer Male(solo)",
                "<b> Rules:</b><br>\n" +
                        "                                        should not use back ground music   \n" +
                        "                                   ",
                R.drawable.best_singer
        ));
        events.add(new Event(
                "Best Singer Female(solo)",
                "<b> Rules:</b><br>\n" +
                        "                                        should not use back ground music   \n" +
                        "                                   ",
                R.drawable.best_singer_female
        ));
        events.add(new Event(
                " Best Dancer Male(solo)",
                "  <b> Rules:</b><br>\n" +
                        "                                        max time 5 mins  <br>\n" +
                        "                                        Bring your own songs\n" +
                        "                                  ",
                R.drawable.best_dancer
        ));
        events.add(new Event(
                "Best Dancer Female(solo)",
                "<b> Rules:</b><br>\n" +
                        "                                        max time 5 mins  <br>\n" +
                        "                                        Bring your own songs\n",
                R.drawable.best_dancer_female
        ));
        events.add(new Event(
                " Telugu ammai contest ",
                " <b> Rules:</b><br>\n" +
                        "                                        Should be presented at the time of event\n" +
                        "                                    ",
                R.drawable.telugu_ammayi
        ));
        events.add(new Event(" Mr.Perfect", " <div class=\"modal-body\">\n" +
                "                                        <p>Rules will be notified at the time of event</p>\n" +
                "                                    </div>\n" +
                "                                    ", R.drawable.mr_perfect));

        events.add(new Event(
                "Rangoli",
                " <h4 class=\"text-center\"> Rangoli</h4>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "                                        A group of two members ( participants should bring their materials)\n" +
                        "                                  ",
                R.drawable.rangoli_contest
        ));
        events.add(new Event(
                " Literary Competitions",
                " <p >\n" +
                        "                                            (a)&nbsp;&nbsp;&nbsp; Extempore</p>\n" +
                        "                                        <p >\n" +
                        "                                            (b)&nbsp;&nbsp; Debate</p>\n" +
                        "                                        <p >\n" +
                        "                                            (c)&nbsp;&nbsp;&nbsp; Creative writing</p>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "                                        Should be presented on the day of event\n" +
                        "                                   ",
                R.drawable.literary_competition
        ));
        events.add(new Event(
                "Telugu Velugu",
                " <p >\n" +
                        "                                            (a)&nbsp;&nbsp;&nbsp; Padaghuri</p>\n" +
                        "                                        <p >\n" +
                        "                                            (b)&nbsp;&nbsp; Vadam-Vivadam</p>\n" +
                        "                                        <p >\n" +
                        "                                            (c)&nbsp;&nbsp;&nbsp; Vyasa Rachana</p>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "                                        Should be presented on the day of event\n" +
                        "                                 ",
                R.drawable.telugu_velugu
        ));

        events.add(new Event(
                "Spot Photography ",
                " <b> Rules:</b><br>\n" +
                        "                                        \n" +
                        "                                           <p>Cameras/Mobile phones</p><br>\n" +
                        "                                           <p>Empty Memory Card-Cameras</p><br>\n" +
                        "                                           <p>Cameras - NEF Raw - 52MB</p><br>\n" +
                        "                                           <p>No editing of photos</p><br>\n" +
                        "                                           <p>Photos can be Miniature, LandScapes, portraits etc.</p><br>\n" +
                        "                                           <p>Time limit is 1 hour</p><br>\n" +
                        "                                           <p>Photo should be taken with in the college boundaries</p><br>\n" +
                        "                                          ",
                R.drawable.spot_photography
        ));
        events.add(new Event(
                " Dubsmash  ",
                "  <b> Rules:</b><br>\n" +
                        "                                        \n" +
                        "                                           <p>Videos should be less than 5 minutes</p><br>\n" +
                        "                                           <p>Video should contain only 1 participant</p><br>\n" +
                        "                                           <p>MP4 format in pendrive</p><br>\n" +
                        "                                           <p>Theme: Comedy</p><br>\n" +
                        "                                   ",
                R.drawable.dubsmash
        ));

        setContentView(R.layout.activity_cultural);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cultural, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent=new Intent(this,Register.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";
        private static final String ARG_EVENT_NAME = "event_name";
        private static final String ARG_EVENT_DESCRIPTION = "event_description";
        private static final String ARG_EVENT_IMAGE = "event_image";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            args.putString(ARG_EVENT_NAME, events.get(sectionNumber).getEventName());
            args.putString(ARG_EVENT_DESCRIPTION, events.get(sectionNumber).getDescription());
            args.putInt(ARG_EVENT_IMAGE, events.get(sectionNumber).getDrawable());
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_cultural, container, false);

            TextView eventName = (TextView) rootView.findViewById(R.id.section_label);
            TextView eventDescription = (TextView) rootView.findViewById(R.id.event_description);
            ImageView eventImage = (ImageView) rootView.findViewById(R.id.event_image);
            Button button=(Button)rootView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(container.getContext(),Register.class);
                    startActivity(intent);
                }
            });
//            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            eventName.setText(getArguments().getString(ARG_EVENT_NAME));
            eventDescription.setText(Html.fromHtml(getArguments().getString(ARG_EVENT_DESCRIPTION)));
            eventImage.setImageResource(getArguments().getInt(ARG_EVENT_IMAGE));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position );
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return events.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return events.get(position).getEventName();

//            switch (position) {
//                case 0:
//                    return "Short Film contest";
//                case 1:
//                    return "Best Singer Male(solo)";
//                case 2:
//                    return "Best Singer Female(solo)";
//                case 3:
//                    return "Best Dancer Male(solo)";
//                case 4:
//                    return "Best Dancer Female(solo)";
//                case 5:
//                    return "Telugu ammai contest";
//                case 6:
//                    return "Rangoli";
//                case 7:
//                    return "Literary Competitions";
//                case 8:
//                    return "Telugu Velugu";
//
//                 }
//            return null;
        }
    }
}
