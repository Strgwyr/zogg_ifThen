package com.example.zogg_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        TextView txtDecision = findViewById(R.id.txtDecision);

        txtLore.setText("You find a small pretty relic on the ground the day before you go on a camping trip with your buddies. "
                + "At night when your buddies are asleep, you decide tot take a walk around the woods by yourself. You notice that the relic is shining but you ignore it." +
                " As you keep walking through the woods, your senses tell you that someone is watching you.What do you do?");

        txtDecision.setText("The first decision involves you going back to your friends and getting help from them. \n \n The second decision lets you ignore your senses and enjoy your evening stroll.");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        TextView txtDecision = findViewById(R.id.txtDecision);
        TextView txtLore = findViewById(R.id.txtLore);

        if (view.getId() == R.id.btnDecision1) {
            txtLore.setText("You successfully make your way back to the your friends and convince them to leave. \n However, while fleeing in your cars, you something is in the backseat...");
            txtDecision.setText("");
        }

        else if (view.getId() == R.id.btnDecision2) {
            txtLore.setText("You are shot with a sleeping dart and when you wake up, you are tied to a tree. Out of pure shock, you pass out again after worrying about the what happens next. When you wake up, You are stuck inside a room. What should you do?");
            txtDecision.setText("Decision 1 involves you waiting to see what happens. \n Decision 2 involves you trying to find a way to escape the room");


                if (view.getId() == R.id.btnDecision1) {
                txtLore.setText("After days of waiting with no food or water someone opens the door. \n It is your friends! However, they were shot from behind and the killer shoots you next");
            }

                if (view.getId() == R.id.btnDecision2) {
                txtLore.setText("You decide to try and break the the door down through force and after a few days, the lock breaks and when you step outside, you are greeted with a group of strangers who are armed with weapons.");
            }


        }
    }
}