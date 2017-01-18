package com.usharama.yourfest.activities;

import android.content.Intent;
import android.provider.ContactsContract;
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

public class Technical extends AppCompatActivity {
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
        {
            events.add(new Event(
                    "Paper Presentation",
                    " <b> Rules:</b><br>\n" +
                            "                                        Paper should be in IEEE format, max two authors per team.\n" +
                            "                                        <br>\n" +
                            "                                        Last Date for submission of your paper in soft copy is 21-Jan-2017.\n" +
                            "                                        Selection of the paper will be notified on 23-Jan-2017.\n" +
                            "                                        <div class=\"panel-group\" id=\"accordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Cloud Computing</p>\n" +
                            "                                                        <p>Big Data</p>\n" +
                            "                                                        <p>Internet Of Things (IoT)</p>\n" +
                            "                                                        <p>Social Networking and Security</p>\n" +
                            "                                                        <p>Artificial Intelligence</p>\n" +
                            "                                                        <p>Mobile Computing</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.cse@gmail.com\">yourfest2017.cse@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>    \n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#aece\">ECE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"aece\" class=\"panel-collapse collapse  \">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p> Wireless Communications and Sensor Networks</p>\n" +
                            "                                                        <p> Digital Image Processing</p>\n" +
                            "                                                        <p> Digital Signal Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.ece@usharama.in\">yourfest2017.ece@usharama.in</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#aeee\">EEE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"aeee\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Renewable energy sources</p>\n" +
                            "                                                        <p>Recent trends in power systems</p>\n" +
                            "                                                        <p>Artificial intelligence techniques</p>\n" +
                            "                                                        <p>Hybrid electric vehicles</p>\n" +
                            "                                                        <p>PLC and SCADA</p>\n" +
                            "                                                        <p>Smart and micro grids</p>\n" +
                            "                                                        <p>Transmission and distribution systems and protection</p>\n" +
                            "                                                        <p>Wireless electricity</p>\n" +
                            "                                                        <p>Any other topic related to Electrical engineering</p>\n" +
                            "                                                        <strong>Send to : <a href=\"mailto:yourfest2017.eee@gmail.com\">yourfest2017.eee@usharama.in&nbsp;</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#acivil\">CIVIL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"acivil\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advances in construction technology</p>\n" +
                            "                                                        <p>Innovative pavement materials</p>\n" +
                            "                                                        <p>Advances in concrete technology</p>\n" +
                            "                                                        <p>RS&amp;HIS applications in civil engineering</p>\n" +
                            "                                                        <p>Nano technology applications in civil engineering</p>\n" +
                            "                                                        <p>Urban traffic control systems</p>\n" +
                            "                                                        <p>Low cost housing and infrastructure</p>\n" +
                            "                                                        <p>Any other topic in civil engineering</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.civil@gmail.com\">yourfest2017.civil@usharama.in&nbsp;</a></strong></p>\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#amechanical\">MECHANICAL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"amechanical\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advanced manufacturing and materials</p>\n" +
                            "                                                        <p>Design and optimization</p>\n" +
                            "                                                        <p>Robotics and automation</p>\n" +
                            "                                                        <p>Turbo machinery</p>\n" +
                            "                                                        <p>Recent trends in thermal sciences</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.mech@gmail.com\">yourfest2017.mech@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                        </div> \n" +
                            "\n ",
                    R.drawable.paper_presentation
            ));
            events.add(new Event("Poster Presentation",
                    " <div class=\"modal-body\">\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Max two authors per poster, minimum size A3\n" +
                            "                                        <h4 class=\"text-center\"> Poster Presentation</h4>\n" +
                            "                                        <div class=\"panel-group\" id=\"baccordion\">\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bacse\">CSE/IT</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bacse\" class=\"panel-collapse collapse in\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Cloud Computing</p>\n" +
                            "                                                        <p>Big Data</p>\n" +
                            "                                                        <p>Internet Of Things (IoT)</p>\n" +
                            "                                                        <p>Social Networking and Security</p>\n" +
                            "                                                        <p>Artificial Intelligence</p>\n" +
                            "                                                        <p>Mobile Computing</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.cse@gmail.com\">yourfest2017.cse@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>    \n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#baece\">ECE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"baece\" class=\"panel-collapse collapse  \">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p> Wireless Communications and Sensor Networks</p>\n" +
                            "                                                        <p> Digital Image Processing</p>\n" +
                            "                                                        <p> Digital Signal Processing</p>\n" +
                            "                                                        <p> Embedded Systems</p>\n" +
                            "                                                        <p> Vlsi Technology</p>\n" +
                            "                                                        <p> Nano Technology</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.ece@usharama.in\">yourfest2017.ece@usharama.in</a></strong></p>\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#baeee\">EEE</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"baeee\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Renewable energy sources</p>\n" +
                            "                                                        <p>Recent trends in power systems</p>\n" +
                            "                                                        <p>Artificial intelligence techniques</p>\n" +
                            "                                                        <p>Hybrid electric vehicles</p>\n" +
                            "                                                        <p>PLC and SCADA</p>\n" +
                            "                                                        <p>Smart and micro grids</p>\n" +
                            "                                                        <p>Transmission and distribution systems and protection</p>\n" +
                            "                                                        <p>Wireless electricity</p>\n" +
                            "                                                        <p>Any other topic related to Electrical engineering</p>\n" +
                            "                                                        <strong>Send to : <a href=\"mailto:yourfest2017.eee@gmail.com\">yourfest2017.eee@usharama.in&nbsp;</a></strong></p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bacivil\">CIVIL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bacivil\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advances in construction technology</p>\n" +
                            "                                                        <p>Innovative pavement materials</p>\n" +
                            "                                                        <p>Advances in concrete technology</p>\n" +
                            "                                                        <p>RS&amp;HIS applications in civil engineering</p>\n" +
                            "                                                        <p>Nano technology applications in civil engineering</p>\n" +
                            "                                                        <p>Urban traffic control systems</p>\n" +
                            "                                                        <p>Low cost housing and infrastructure</p>\n" +
                            "                                                        <p>Any other topic in civil engineering</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.civil@gmail.com\">yourfest2017.civil@usharama.in&nbsp;</a></strong></p>\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                            <div class=\"panel panel-default\">\n" +
                            "                                                <div class=\"panel-heading\">\n" +
                            "                                                    <h4 class=\"panel-title\">\n" +
                            "                                                        <a data-toggle=\"collapse\" data-parent=\"#baccordion\" href=\"#bamechanical\">MECHANICAL</a>\n" +
                            "                                                    </h4>\n" +
                            "                                                </div>\n" +
                            "                                                <div id=\"bamechanical\" class=\"panel-collapse collapse\">\n" +
                            "                                                    <div class=\"panel-body\">\n" +
                            "                                                        <p>Advanced manufacturing and materials</p>\n" +
                            "                                                        <p>Design and optimization</p>\n" +
                            "                                                        <p>Robotics and automation</p>\n" +
                            "                                                        <p>Turbo machinery</p>\n" +
                            "                                                        <p>Recent trends in thermal sciences</p>\n" +
                            "                                                        <p>\n" +
                            "                                                            <strong>Send to : <a href=\"mailto:yourfest2017.mech@gmail.com\">yourfest2017.mech@usharama.in </a></strong></p>\n" +
                            "                                                        <p>\n" +
                            "                                                            &nbsp;</p>\n" +
                            "\n" +
                            "\n" +
                            "                                                    </div>\n" +
                            "                                                </div>\n" +
                            "                                            </div>\n" +
                            "                                        </div> \n" +
                            "                                    </div>\n" +
                            "                                   ",
                    R.drawable.poster_presentation));
            events.add(new Event("MODEL EXHIBITION",
                    " <div class=\"modal-body\">\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Model Exhibition: Should be a team of two members.<br>\n" +
                            "                                        For Diploma(all branches) students only.\n" +
                            "                                    </div>\n" +
                            "                                   ",
                    R.drawable.model_exhibition));
            events.add(new Event(" Project Exhibition",
                    "  <div class=\"modal-body\">\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Project: Should be a team of two members\n" +
                            "                                    </div>\n" +
                            "                                 ",
                    R.drawable.project_exhibition));
            events.add(new Event("Robo Race",
                    "<div class=\"modal-body\">\n" +
                            "       <b class=\"text-danger\">Event Co-ordinator: Mr. D Murali Krishna, Mechanical,  Diploma Incharge,  Ph:7382608011  </b><br>\n" +
                            "                                  <b> Rules:</b><br>\n" +
                            "                                        Can be a team of three members\n" +
                            "                                    </div>\n",
                    R.drawable.robo_race));
            events.add(new Event(
                    "Engineer ka MahaSangram",
                    "  <b class=\"text-danger \"> Event Co-ordinator: Prof. A Madanamohana Rao, Vice-Principal</b>\n" +
                            "                                      <p>Phase-1 (All students): Online exam-30 Minutes, 30 Multiple choice questions</p>\n" +
                            "<p>Phase-2 (30 Students): Answers should be in writing</p>\n" +
                            "<p>Round-1 : Basic knowledge in Engineering (10 questions scrolls on board) 10 Marks</p>\n" +
                            "<p>Round-2 : Logos (5 Each displayed for 10 seconds) 5 Marks</p>\n" +
                            "<p>Round-3 : Taglines (5 Each displayed for 10 seconds) 5 Marks</p>\n" +
                            "<p>Round-4 : Skill round (5-Questions, Each displayed for 60 seconds) 10 Marks</p>\n" +
                            "<p>Round-5: Observations on a page (Displayed for 5 minutes and then 10 oral questions) 10 Marks</p>\n" +
                            "<p>Phase-3 (10 Students):</p>\n" +
                            "<p>Round-1 : Group Discussion 10 Marks</p>\n" +
                            "<p>Round-2: Technical Round 10 Marks</p>\n" +
                            "<p>Round-3: HR Round 10 Marks</p>\n" +
                            "<p>Phase-4 (5 Students): 50 i-respond questions. (This will be conducted on 26th Jan&rsquo;17)</p>\n" +
                            "<p>For each i-respond question: 1. Correct answer &amp; 1st response: 4 marks 2. Correct answer &amp; 2nd response: 3 marks 3. Correct answer &amp; 3rd response: 2 marks 4. Correct answer &amp; 4th response: 1 marks 5. Correct answer &amp; 5th response: 0 marks</p>\n" +
                            "<p>6. No response : -1 marks 7. Wrong answer : -2 marks</p>\n" +
                            "<p>NOTE: Cumulative Scores are displayed after each i-respond question. Time taken by individual respondent for each question will be showed on request.</p>\n" +
                            "<p>&nbsp;</p>\n" +
                            "<p>PRIZE: One Lakh Rupees will be given on 26th Jan&rsquo;17 in prize distribution function.</p>\n" +
                            "<p>&nbsp;</p>\n" +
                            "<p>Note: Multiple choice questions will be given in Phase-1 and Phase-4. These are from General Knowledge, Aptitude, Puzzles, Reasoning, English, Mathematics, Physics, Chemistry, Basics in Computers, Electrical, Electronics, Civil and Mechanics and are at Ist B.Tech. standard.</p>\n" +
                            "<p>For further details contact: Ph.9177412255, email: viceprincipal@usharama.in</p>\n\n\n\n\n  ",
                    R.drawable.engineer_ka_mahasangram));
            events.add(new Event(" Best Business Idea",
                    "       <b class=\"text-danger\">Event Co-ordinator: Mr. V Mahesh John, T&P,  Ph:9396804756  </b><br>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be presented at the time of event\n",
                    R.drawable.business_idea));
            events.add(new Event(" Bridge Construction",
                    "<b class=\"text-danger\">Event Co-ordinator: Mr. V Srinivasa Rao, Civil,  Ph:9490735381  </b><br>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be a team of two members\n",
                    R.drawable.bridge_construction));
            events.add(new Event("Technical Quiz",
                    " <b> Rules:</b><br>\n" +
                            "\n" +
                            "                                        For <b><span class=\"text-primary\">Diploma</span>, <span  class=\"text-danger\">B.Tech</span> and <span class=\"text-success\"> M.Tech</span></b>\n" +
                            "\n" +
                            "                                        <br>\n" +
                            "                                        Should be a team of two members\n",
                    R.drawable.technical_quiz));
            events.add(new Event(" Circuitrix",
                    " <b class=\"text-danger\">Event Co-ordinator: Mr. B Balaji, ECE,  Ph:9010250644 </b><br>\n" +
                            "                                        <p>This event will be organized by the III year ECE students<br>\n" +
                            "                                            The event consist of 4 rounds.<br>\n" +
                            "                                            1. Written test[ Aptitute, EDC, Basic Physics, STLD, ET] -20 bits - 20 Mins<br>\n" +
                            "                                            2. Components Identification <br>\n" +
                            "                                            using color coding, IC numbers etc..<br>\n" +
                            "                                            PIN names. 20sec per head<br>\n" +
                            "                                            3. Circuit Designing:<br>\n" +
                            "                                            Connect the circuit as per the diagram and show the output\n" +
                            "                                            <br>\n" +
                            "                                            4. Quiz: Current affairs\n" +
                            "                                            <br>\n" +
                            "                                            Spot Registrations are accepted.<br>\n" +
                            "                                            The event will be conducted on 25/1/16\n" +
                            "                                            <br>\n" +
                            "                                            Timings: will be start around 10:00 AM\n" +
                            "                                            <br>Participation certificates will be given\n" +
                            "                                        </p>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Will be announced on spot\n" +
                            "\n" +
                            "                                        <br>\n" +
                            "                                        <br>\n" +
                            "                                        Organized by <br>\n" +
                            "                                        B.Uttej Sai\n" +
                            "                                        <br>\n" +
                            "8374760914",
                    R.drawable.circuitrix));
            events.add(new Event(" Techno Hunt",
                    "  <b class=\"text-danger\">Event Co-ordinator: Ms K Sowjanya, ECE, Ph:8096732721 </b><br>\n" +
                            "                                        <p>\n" +
                            "                                            This is an event conducted by III-ECE-A students\n" +
                            "                                            <br>\n" +
                            "                                            It is similar to treasure hunt, but hints and clues are in Technical format\n" +
                            "                                            <br>\n" +
                            "                                            This event consists of four stages. Overall time limit for this event is 30 min.\n" +
                            "                                            <br>\n" +
                            "                                            Participants are able to participate as a team of 3 members.\n" +
                            "                                            <br>\n" +
                            "                                            Clues and hints for hunting are in and around the Campus premises.\n" +
                            "                                            <br>\n" +
                            "                                            Students of these branches are eligible for participation : ECE, EEE, CSE, MECH\n" +
                            "                                            <br>\n" +
                            "                                            Registration fee is Rs.100/-\n" +
                            "                                        </p>\n" +
                            "                                        <b> Rules:</b><br>\n" +
                            "                                        Should be presented at the time of event <br><br>\n",
                    R.drawable.technohunt));
            events.add(new Event("Swimming in C",
                    " <b class=\"text-danger\">Event Co-ordinator: Mr SM Roychoudri, CSE, Ph:9849645441 </b><br>\n" +
                            "                                        <b>Round 1</b>:<br>\n" +
                            "                                        [screening test]<br>In this round, 20 bits will be given to each participant and the time limit is 25minutes.<br>The questions consists of:<br>Basics of C language<br>Simple logic evaluation bits.\n" +
                            "                                        <br><b><br>Rules for round1:</b><br>Participants should return the answer sheet before 25min.<br>The qualified students will be promoted to the second round.\n" +
                            "                                        <br>\n" +
                            "                                        <br><hr>\n" +
                            "                                        <b>Round 2:</b>\n" +
                            "                                        <br>[Implementation of logic]\n" +
                            "                                        <br>In this round, a logic /problem statement will be given and the students need to generate their own code with accurate output.\n" +
                            "                                        <br>Time limit of 30 minutes<br>The students will be provided with a white paper and the expected out should be written.<br><br><b>Rules for round2:</b><br>Logic is common to all the participants.<br>The answer sheet must be submitted by the participants on or before 30 min. There after the answer sheets are not accepted.<br>The students selected in the second round will be promoted to the third round.\n" +
                            "                                        <br><br><hr><b>Round 3:</b><br>[Debugging]<br>In this, the participant should detect the errors in the given program and display the desired output.<br><br><b>Rules for round3:</b><br>\n" +
                            "                                        In this round, the participants should detect the error within the given time.<br>If more than one participants detect the error at the same time, their marks in the first two rounds will be considered.<br>The time limit for the third round will be         announced at the time of event.  \n" +
                            "                                        <br> <b> Rules:</b><br>\n" +
                            "                                        Should be presented at the time of event <br><br>\n" +
                            "\n   ",
                    R.drawable.c_programming));
            events.add(new Event("Auto CAD",
                    "  <b class=\"text-danger\">Event Co-ordinator: Mr B Anup, Civil, Ph:8143182364 </b><br>\n" +
                            "                                        <p> <b> Rules:</b><br>\n" +
                            "                                        <p>Time limit: 1 hour</p> \n" +
                            "<p>Drawing:- Section, plan, elevation </p>",
                    R.drawable.autocad));


        }
        setContentView(R.layout.activity_technical);

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
        getMenuInflater().inflate(R.menu.menu_technical, menu);
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
            Intent intent = new Intent(this, Register.class);
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
            View rootView = inflater.inflate(R.layout.fragment_technical, container, false);

            TextView eventName = (TextView) rootView.findViewById(R.id.section_label);
            TextView eventDescription = (TextView) rootView.findViewById(R.id.event_description);
            ImageView eventImage = (ImageView) rootView.findViewById(R.id.event_image);
            Button button = (Button) rootView.findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(container.getContext(), Register.class);
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
            return PlaceholderFragment.newInstance(position);
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
//                    return "Paper Presentation";
//                case 1:
//                    return "Poster Presentation";
//                case 2:
//                    return "Model Exhibition";
//                case 3:
//                    return "Project Exhibition";
//                case 4:
//                    return "Robo Race";
//                case 5:
//                    return "Engineer ka MahaSangram";
//                case 6:
//                    return "Best Business Idea";
//                case 7:
//                    return "Bridge Construction";
//                case 8:
//                    return "Technical Quiz";
//                case 9:
//                    return "Circuitrix";
//                case 10:
//                    return "Mr.Perfect";
//            }
//            return null;
        }
    }
}
