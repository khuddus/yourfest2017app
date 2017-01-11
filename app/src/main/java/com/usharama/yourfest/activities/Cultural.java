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
                "  <b class=\"text-danger\">Event Co-ordinator: Mr. B Phani Ranga Raja,EEE,  Ph:9032916581 </b><br>\n" +
                        "                                        <p>\n" +
                        "                                            <strong><u>Short film Mania</u></strong>:&nbsp; Max. time limit is <b>10 mins</b>.</p>\n" +
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
                        "                                        <p>\n" +
                        "                                            &nbsp;&nbsp;&nbsp;&nbsp; 6. Cashless Transactions</p>\n" +
                        "                                        <p>\n" +
                        "                                            &nbsp;</p>\n",
                R.drawable.short_films
        ));
        events.add(new Event(
                "Best Singer (solo)",
                "   <br><b class=\"text-danger\">Event Co-ordinator: Mr. B Trivikrama Rao, IT,  Ph:9703418339 </b><br>\n" +
                        "                                        <br> Prizes will be awarded separately for <b>Male singer</b> and <b>Female singer</b>.<br>\n" +
                        "                                        <br> <b> Rules:</b><br>\n" +
                        "                                        should not use back ground music   \n ",
                R.drawable.best_singer
        ));

        events.add(new Event(
                " Best Dancer (solo)",
                "   <b class=\"text-danger\">Event Co-ordinator: Mr. M Rama Mohana Rao, ECE-HOD,  Ph:9440095992 </b><br>\n" +
                        "                                        <br>\n" +
                        "                                        Prizes will be awarded separately for <b>Male Dancer</b> and <b>Female Dancer</b>.<br>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "                                        max time 5 mins  <br>\n" +
                        "Bring your own songs and properties  ",
                R.drawable.best_dancer
        ));

        events.add(new Event(
                " Telugu ammai contest ",
                " <b> <b class=\"text-danger\">Event Co-ordinator:Ms Y Salini, CSE,  Ph:8121169999 </b><br>\n" +
                        "                                        <br><br><b> Rules:</b><br>\n" +
                        "                                        Should be presented at the time of event\n ",
                R.drawable.telugu_ammayi
        ));
        events.add(new Event(" Mr.Perfect",
                "     <b class=\"text-danger\">Event Co-ordinator: Mr. P Syam Sundar, ECE,  Ph:8885522122 </b><br>\n" +
                        "                                        <p>Rules will be notified at the time of event</p>\n ",
                R.drawable.mr_perfect));

        events.add(new Event(
                "Rangoli",
                "   <b class=\"text-danger\">Event Co-ordinator:Ms M Naga Deepthi , Maths,  Ph:9866920172 </b><br>\n" +
                        "                                        <br><br> <b> Rules:</b><br>\n" +
                        "                                        A group of two members ( participants should bring their materials)\n ",
                R.drawable.rangoli_contest
        ));
        events.add(new Event(
                " Literary Competitions",
                "  <b class=\"text-danger\">Event Co-ordinator:Ms M Revathi Devi , English,  Ph:8106146054 </b><br>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (a)&nbsp;&nbsp;&nbsp; Extempore</p>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (b)&nbsp;&nbsp; Debate</p>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (c)&nbsp;&nbsp;&nbsp; Creative writing</p>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "                                        Should be presented on the day of event\n",
                R.drawable.literary_competition
        ));
        events.add(new Event(
                "Telugu Velugu",
                " <b class=\"text-danger\">Event Co-ordinator: Dr P Ramesh Babu , Physics,  Ph:9490176196 </b><br>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (a)&nbsp;&nbsp;&nbsp; Padaghuri</p>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (b)&nbsp;&nbsp; Vadam-Vivadam</p>\n" +
                        "                                        <p style=\"margin-left: 0.75in;\">\n" +
                        "                                            (c)&nbsp;&nbsp;&nbsp; Vyasa Rachana</p>\n" +
                        "                                        <b> Rules:</b><br>\n" +
                        "Should be presented on the day of event",
                R.drawable.telugu_velugu
        ));

        events.add(new Event(
                "Spot Photography ",
                "    <b class=\"text-danger\">Event Co-ordinator:Mr E Ramakrishna Reddy ,ECE,  Ph:9502251501 </b><br>\n" +
                        "                                        <br><br> <b> Rules:</b><br>\n" +
                        "\n" +
                        "                                        <p>Cameras/Mobile phones</p> \n" +
                        "                                        <p>Empty Memory Card-Cameras</p> \n" +
                        "                                        <p>Cameras - NEF Raw - 52MB</p> \n" +
                        "                                        <p>No editing of photos</p> \n" +
                        "                                        <p>Photos can be Miniature, LandScapes, portraits etc.</p> \n" +
                        "                                        <p>Time limit is 1 hour</p> \n" +
                        "                                        <p>Photo should be taken with in the college boundaries</p> \n" +
                        "\n  ",
                R.drawable.spot_photography
        ));
        events.add(new Event(
                " Dubsmash  ",
                "   <b class=\"text-danger\">Event Co-ordinator: Mr T Anil Kumar ,Chemistry,  Ph:9985148232 </b><br>\n" +
                        "                                        <br><br><b> Rules:</b><br>\n" +
                        "\n" +
                        "                                        <p>Videos should be less than 5 minutes</p> \n" +
                        "                                        <p>Video should contain only 1 participant</p> \n" +
                        "                                        <p>MP4 format in pendrive</p> \n" +
                        "                                        <p>Theme: Comedy</p> \n" +
                        "\n  ",
                R.drawable.dubsmash
        ));
        events.add(new Event(
                " Master Communicator  ",
                "     <b class=\"text-danger\">Event Co-ordinator: Mr L Surendra ,ECE,  Ph:9949742597 </b><br>\n" +
                        "                                        <p>1. Written Test - 20 Questions, multiple choice - 20 min</p>\n" +
                        "                                        <p><b>Topics:-</b></p>\n" +
                        "                                        <p>Similarity checker<br>\n" +
                        "                                            Observation Test<br>\n" +
                        "                                            Cross words<br>\n" +
                        "                                            Puzzles\n" +
                        "                                        </p>\n" +
                        "                                        <p>2. Just-A-Minute(JAM) - 1 min</p>\n" +
                        "                                        <p>3. Tongue Twisters - 2 minutes </p>\n" +
                        "                                        <p>Rules will be notified at the time of event</p>\n" +
                        "\n" +
                        "                                        <p>Contact No: 7842444676(Kesava), 8142938115(Harish)</p>\n",
                R.drawable.communicator
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
