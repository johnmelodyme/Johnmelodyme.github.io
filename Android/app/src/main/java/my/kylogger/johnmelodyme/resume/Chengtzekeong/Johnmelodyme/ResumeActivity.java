package my.kylogger.johnmelodyme.resume.Chengtzekeong.Johnmelodyme;

/**
 * Copyright 2020 © john Melody Melissa
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @Author : john Melody Melissa
 * @Copyright: john Melody Melissa  © Copyright 2020
 * @INPIREDBYGF : Tan Sin Dee <3
 * @Class: ResumeActivity.class
 */

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ResumeActivity extends AppCompatActivity {
    public static final String TAG = "JohnMelody";
    private WebView RESUME;
    private WebSettings webSettings;
    public static String RESUME_URL;

    // TODO DeclarationInit()
    @SuppressLint("SetJavaScriptEnabled")
    public void DeclarationInit(){
        RESUME = findViewById(R.id.website);
        RESUME_URL = getResources().getString(R.string.ResumeUrl);

        WebSettings webSettings = RESUME.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Log.d(TAG, "DeclarationInit: ");
        Log.d(TAG, "DeclarationInit: " + "Web.GetSetting()");
    }

    @Override
    // TODO onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + ResumeActivity.class.getSimpleName());
        DeclarationInit();
        LaunchResumeWebsite();
    }

    // TODO LaunchResumeWebsite()
    private void LaunchResumeWebsite() {
        RESUME.loadUrl(RESUME_URL);
        Log.d(TAG, "LaunchResumeWebsite: " + RESUME_URL);
    }
}