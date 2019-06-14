package com.example.firstfrag;


import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Book> lstBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstBook = new ArrayList<>();
        lstBook.add(new Book("What is mindfulness? ","Benefits","The best definition of mindfulness is quoted by Jon Kabat-Zinn who states: \n" +
                "‘‘mindfulness is paying attention on purpose, in the present moment, and nonjudgmentally to the unfolding of experience moment by moment.’’",R.drawable.medi));
        lstBook.add(new Book("Mindfulness","Benefits","Breaking it down \n"+"\uF097 \tPaying attention: To be mindful, you need to pay attention to whatever you choose to attend to. \n" +
                "\uF097 \tNon-judgementally: The temptation is to judge experience as good or bad or like/dislike. I want to feel bliss; I don’t like to feel afraid. Letting go of judgements help you to see things as they are. \n" +
                "\uF097 \tPresent Moment: The reality of being in the here and now means you just need to \n" +
                "be aware of the way things are as they are now. Your experience is valid and correct just as it is. \n",R.drawable.fir));
        lstBook.add(new Book("How does mindfulness work? ","Benefits","Human brain has a tendency to spend all time either analyzing and rumination about the past or fantasizing and planning about the future. As a result, we miss out on what is going on around us currently  \n" +
                "Mindfulness increases awareness and helps in bringing the mind and body to focus on the present. The heightened awareness helps in switching from an auto pilot mode and taking responsibility and control of the actions and emotions and responding mindfully \n" +
                "With practice, mindfulness allows feelings and experience to exist without letting them drive your actions. It helps in delaying immediate reaction to respond to situations and experience in a calm and nonjudgmental way. Mindfulness heightens body awareness, when an external stimulus triggers an emotional reaction, the attention system detects a conflict.  \n" +
                "Heightened body awareness helps to detect physiological aspects of the feelings present (e.g. body tension, rapid heartbeat, short shallow breath). This triggers the emotion regulation process to react to the stimulus differently than normal (ex: just noticing it as opposed to reacting to it) \n" +
                " \n" +
                "This has been substantiated by scientific study, Mindfulness is identified to impact the Neo- Cortex region of the mammalian brain. This region is recognized to house abilities of higher order such as logical reasoning, creation, awareness and empathy. With constant practice of mindfulness exercises we learn to properly use the mind to its full manifestation power. \n",R.drawable.sec));
        lstBook.add(new Book("Where do we see mindfulness in daily life? ","Benefits","Examples of Non- Mindful behaviours: \n" +
                " \n" +
                "•\tExperiencing some emotion and not be conscious of it until sometime later.  \n" +
                "•\tBreak or spill things because of carelessness, not paying attention or thinking of something else. \n" +
                "•\tFinding it difficult to stay focused on what’s happening in the present \n" +
                "•\tTend to walk quickly without paying attention to the experience along the way.  \n" +
                "•\tRushing through activities without being really attentive to them.  \n" +
                "•\tBeing preoccupied with the future or the past. \n" +
                "•\tBeing very focused on the goal I want to achieve that you lose touch with what you are doing right now to get there.  \n" +
                "•\tSnacking without being aware that I’m eating.                   \n",R.drawable.third));
        lstBook.add(new Book("Benefits of incorporating mindful practices in everyday life: ","Benefits","There is scientific evidence to prove that practicing and making mindfulness as a habit has several positive impact and benefits. Listed here are few of them  \n" +
                "•\tImproves self-perception and expands the sense of identity (self) \n" +
                "•\tTeaches you to be in the present and thereby improves resilience, reduces stress and improves overall quality of life \n" +
                "•\tImproves overall wellbeing and happiness  \n" +
                "•\tIncreases span of attention and focus and thereby improves performance  \n" +
                "•\tTeaches to detach from emotions. You are experiencing an event/emotion – you are not that event/emotion and there by bring about self-regulation of emotions • Better decision making and interpersonal skills \n",R.drawable.fourth));
        lstBook.add(new Book("How to achieve mindfulness? ","Benefits","Mindfulness is a process and can be learnt. The process includes the following 5 stages: \n" +"This process can be applied to every situation in life. \n" +
                "Mindfulness starts by noticing and bring the mind to focus. The best way hence to learn mindfulness is through meditation. \n" +
                "Meditation is a process of focussing on breath, image or sound. as a philosophy meditation stresses on stopping all thoughts and rest the mind in thoughtless peace. The variation to this is mindful meditation that considers flow of thoughts as a normal phenomenon, this is therefore more about how to deal with thoughts and establish connect with the current state. \n",R.drawable.fifth));
        lstBook.add(new Book("Mindful meditation vs Meditation","Benefits","",R.drawable.a));
        lstBook.add(new Book("What Mindfulness is and isn’t:","Benefits","",R.drawable.seven));
        lstBook.add(new Book("Mindfulness Attitudes: ","Benefits","",R.drawable.eight));
        lstBook.add(new Book("Types of Mindful Meditation:  ","Benefits"," \n" +
                "> \tBreathing Exercises: \n" +
                "\uF097\tBalloon breathing \n" +
                "\uF097\tRibcage breathing \n" +
                "\uF097\tDiaphragm breathing \n" +
                "\uF097\tStomach breathing \n" +
                "> \tDistancing exercise:  \n" +
                "\uF097\tImagine thoughts speeding away like a train \n" +
                "\uF097\tLeaves floating down a stream \n" +
                "> \tMetaphor Meditation \n" +
                "\uF097\tMountain Meditation \n" +
                "\uF097\tRetreat breathing \n" +
                "\uF097\tCleansing sanctuary \n" +
                "> \tNoticing exercises \n" +
                "\uF097\tFood- Raisin exercise \n" +
                "\uF097\tBody scan \n" +
                "\uF097\tMindful listening \n" +
                "\uF097\tMindful smiling \n" +
                "> \tGrounding exercise: \n" +
                "\uF097\tSoles of the feet  \n" +
                "\uF097\tGrounding yourself \n" +
                ">   \tLabelling exercise \n" +
                "\uF097\t‘Just worrying ‘technique \n" +
                "\uF097\tIdentifying & comparing emotions \n" +
                "\uF097\tForgiveness meditation \n",R.drawable.last));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,1));
        myrv.setAdapter(myAdapter);


    }
}
