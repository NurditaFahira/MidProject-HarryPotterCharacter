package com.example.midprojectharrypotternurditafahira.UI.Home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.example.midprojectharrypotternurditafahira.Adapter.HomeAdapter
import com.example.midprojectharrypotternurditafahira.DataKarakter
import com.example.midprojectharrypotternurditafahira.DataKarakterItem
import com.example.midprojectharrypotternurditafahira.Network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.ArrayList

class HomeViewModel : ViewModel() {

    init{
        Log.d("HomeViewModel", "HomeviewModel Created")
    }

    val listKarakter : ArrayList<DataKarakterItem> = arrayListOf()

    fun getDataFromApi(recyclerView: RecyclerView){
        RetrofitClient.instance.getDataKarakter().enqueue(object : Callback<DataKarakter>{
            override fun onResponse(call: Call<DataKarakter>, response: Response<DataKarakter>) {
                val data = response.body()
               // listKarakter.addAll(data as ArrayList<DataKarakterItem>)
                //listKomik.addAll(data as ArrayList<komik>)
                recyclerView.adapter = HomeAdapter(data as ArrayList<DataKarakterItem>)
            }

            override fun onFailure(call: Call<DataKarakter>, t: Throwable) {
                Log.d("HomeViewModel", "HomeViewModel fun api Onfailure")
            }
        })
    }
}