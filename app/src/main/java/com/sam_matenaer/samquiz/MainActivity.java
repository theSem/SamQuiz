package com.sam_matenaer.samquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view){
        //Store user answers
        RadioGroup sodaGroup = (RadioGroup)findViewById(R.id.favoriteSodaGroup);
        int soda = sodaGroup.getCheckedRadioButtonId();
        RadioGroup foodGroup = (RadioGroup)findViewById(R.id.favoriteFoodGroup);
        int food = foodGroup.getCheckedRadioButtonId();
        RadioGroup rapperGroup = (RadioGroup)findViewById(R.id.favoriteRapperGroup);
        int rapper = rapperGroup.getCheckedRadioButtonId();
        RadioGroup breedGroup = (RadioGroup)findViewById(R.id.favoriteDogBreedGroup);
        int breed = breedGroup.getCheckedRadioButtonId();
        EditText birthdayInput = (EditText) findViewById(R.id.birthdayDate);

        int totalCorrect = 0;
        if (soda != -1) if (findViewById(soda).equals(findViewById(R.id.sprite))) totalCorrect++;
        if (food != -1) if (findViewById(food).equals(findViewById(R.id.spaghetti))) totalCorrect++;
        if (rapper != -1) if (findViewById(rapper).equals(findViewById(R.id.skiMask))) totalCorrect++;
        if (breed != -1) if (findViewById(breed).equals(findViewById(R.id.mutt))) totalCorrect++;
        if (birthdayInput.getText().toString().equals("04/26/1998")) totalCorrect++;

        Toast.makeText(this,totalCorrect + "/5 answers correct", Toast.LENGTH_LONG).show();
        sodaGroup.clearCheck();
        foodGroup.clearCheck();
        rapperGroup.clearCheck();
        breedGroup.clearCheck();
        birthdayInput.setText("");
    }
}
