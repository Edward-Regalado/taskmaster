package com.regalado.taskmaster.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.amplifyframework.core.Amplify;
import com.regalado.taskmaster.R;

public class VerifyAccountActivity extends AppCompatActivity {

    public static final String TAG = "VerifyAccountActivity";
    public static final String VERIFY_ACCOUNT_EMAIL_TAG = "Verify_Account_Email_Tag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        handleVerify();
    }

    public void handleVerify()
    {
        Intent callingIntent = getIntent();
        String email = callingIntent.getStringExtra(SignupActivity.SIGNUP_EMAIL_TAG);
        EditText usernameEditText = (EditText) findViewById(R.id.editTextUsernameVerifyActivity);
        usernameEditText.setText(email);

        Button verifyAccountVerifyButton = (Button) findViewById(R.id.buttonVerifyVerifyAccountActivity);
        verifyAccountVerifyButton.setOnClickListener(v ->
        {
            String username = usernameEditText.getText().toString();
            String verificationCode = ((EditText) findViewById(R.id.editTextVerificationCodeVerifyActivity)).getText().toString();

            Amplify.Auth.confirmSignUp(username,
                    verificationCode,
                    good ->
                    {
                        Log.i(TAG, "Verification succeeded: " + good.toString());
                        Intent goToLogInIntent = new Intent(VerifyAccountActivity.this, LoginActivity.class);
                        goToLogInIntent.putExtra(VERIFY_ACCOUNT_EMAIL_TAG, username);
                        startActivity(goToLogInIntent);
                    },
                    bad ->
                    {
                        Log.i(TAG, "Verification failed with username: " + "ed@codefellows.com" + " with this message: " + bad.toString());
                        runOnUiThread(() ->
                                {
                                    Toast.makeText(VerifyAccountActivity.this, "Verify account failed!", Toast.LENGTH_SHORT).show();
                                }
                        );
                    }
            );
        });
    }
}
