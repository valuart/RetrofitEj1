package com.example.retrofitej1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.retrofitej1.modelo.Post;

public class MainActivity extends AppCompatActivity {
    private MainActivityViewModel mv;
    private TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mostrar=findViewById(R.id.tvMostrar);
            mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(MainActivityViewModel.class);
            mv.getPostMutableLiveData().observe(this, new Observer<Post>() {
                @Override
                public void onChanged(Post post) {
                    mostrar.setText(post.getBody());
                }
            });

            mv.leerPost();

        }

    }
