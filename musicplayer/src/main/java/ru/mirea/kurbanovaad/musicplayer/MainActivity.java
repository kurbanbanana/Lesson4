package ru.mirea.kurbanovaad.musicplayer;

import androidx.appcompat.app.AppCompatActivity;
import ru.mirea.kurbanovaad.musicplayer.databinding.ActivityMainBinding;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding	= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}