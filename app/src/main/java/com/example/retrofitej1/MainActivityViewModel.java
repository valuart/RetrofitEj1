package com.example.retrofitej1;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.retrofitej1.modelo.Post;
import com.example.retrofitej1.request.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<Post> postMutableLiveData;

    public MutableLiveData<Post> getPostMutableLiveData() {
        if (postMutableLiveData == null) {
            postMutableLiveData = new MutableLiveData<>();
        }
        return postMutableLiveData;
    }

    public void leerPost(){

        Call<Post> callPost= ApiClient.getMyApiClient().obtenerPost(1);

        callPost.enqueue(new Callback<Post>() {
            @Override
            public void onResponse(Call<Post> call, Response<Post> response) {
                if(response.isSuccessful()){
                    postMutableLiveData.postValue(response.body());
                }
            }

            @Override
            public void onFailure(Call<Post> call, Throwable t) {
                Log.d("Error",t.getMessage());

            }
        });


    }

}
