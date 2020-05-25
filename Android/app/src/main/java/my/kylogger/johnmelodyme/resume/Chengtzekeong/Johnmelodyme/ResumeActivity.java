package my.kylogger.johnmelodyme.__resume.Chengtzekeong.Johnmelodyme;

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
 * @Class: __resumeActivity.class
 */

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class __resumeActivity extends AppCompatActivity {
    public static final String TAG = "JohnMelody";
    private WebView __resume;
    private WebSettings __web_settings;
    public static String ___resume_url;

    // TODO DeclarationInit()
    @SuppressLint("SetJavaScriptEnabled")
    public void DeclarationInit(){
        __resume = findViewById(R.id.website);
        ___resume_url = getResources().getString(R.string.__resumeUrl);

        WebSettings __web_settings = __resume.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Log.d(TAG, "DeclarationInit: ");
        Log.d(TAG, "DeclarationInit: " + "Web.GetSetting()");
    }

    // TODO onCreate()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + __resumeActivity.class.getSimpleName());
        DeclarationInit();
        Launch__resumeWebsite();
    }

    // TODO Launch__resumeWebsite()
    private void Launch__resumeWebsite() {
        __resume.loadUrl(___resume_url);
        Log.d(TAG, "Launch__resumeWebsite: " + ___resume_url);
    }
}