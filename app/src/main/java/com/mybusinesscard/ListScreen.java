package com.mybusinesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mybusinesscard.models.ContactModel;

public class ListScreen extends AppCompatActivity {

    TextView bName, bDescription, bAddress, bMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        bName = findViewById(R.id.b_name);
        bDescription = findViewById(R.id.b_discription);
        bAddress = findViewById(R.id.b_address);
        bMail = findViewById(R.id.b_email);

        ContactModel mContact = new ContactModel(
                "Techies",
                "Helps create your dream startups",
                "image-url",
                "470 Sisulu Street, Pretoria, 0002",
                "maddoxmaila719@gmail.com",
                "+27643300833"
        );

        bName.setText(mContact.getBusinessName());
        bDescription.setText(mContact.getBusinessSlogan());
        bAddress.setText(mContact.getBusinessAddress());
        bMail.setText(mContact.getBusinessEmail());


    }
}