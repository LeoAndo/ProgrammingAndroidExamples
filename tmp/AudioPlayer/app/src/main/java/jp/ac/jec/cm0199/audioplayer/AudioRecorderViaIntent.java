package jp.ac.jec.cm0199.audioplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AudioRecorderViaIntent extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recordAudio();
    }

    private void recordAudio() {
        Intent intent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION); // same as - new Intent("android.provider.MediaStore.RECORD_SOUND");
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) playAudio(data.getData());
        }
    }

    private void playAudio(Uri audio) {
        finish();
        if (audio == null) return;

        Intent intent = new Intent(this, AudioPlayer.class);
        intent.putExtra(AudioPlayer.AUDIOFILEURI, audio);
        startActivity(intent);
    }
}
