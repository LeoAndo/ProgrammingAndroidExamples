package jp.ac.jec.cm0199.audioplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.audioplayer).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioPlayer.class));  // Launch the AudioPlayer Example
        });

        findViewById(R.id.audioplayerwmediacontroller).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioPlayerWMediaController.class));  // Launch the AudioPlayer W Media ControllerExample
        });

        findViewById(R.id.audioplayerwaudiotrack).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioPlayerWAudioTrack.class));  // Launch the AudioPlayer W AudioTrack Example
        });

        findViewById(R.id.audiorecorder).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioRecorder.class));  // Launch the AudioRecorder Example
        });

        findViewById(R.id.audiorecorderwaudiorecord).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioRecorderWAudioRecord.class));  // Launch the AudioRecorder W AudioRecord Example
        });

        findViewById(R.id.audiorecorderintent).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), AudioRecorderViaIntent.class));  // Launch the AudioRecorder By Intent Example
        });

        findViewById(R.id.videoplayer).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), VideoPlayer.class));  // Launch the VideoPlayer Example
        });

        findViewById(R.id.videorecorder).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), VideoRecorder.class));  // Launch the VideoRecorder Example
        });

        findViewById(R.id.videorecorderintent).setOnClickListener(v -> {
            startActivity(new Intent(getBaseContext(), VideoRecorderViaIntent.class));  // Launch the VideoRecorder By Intent Example
        });
    }
}