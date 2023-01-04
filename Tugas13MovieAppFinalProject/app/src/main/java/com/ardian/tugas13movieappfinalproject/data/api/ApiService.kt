package com.ardian.tugas13movieappfinalproject.data.api


import com.ardian.tugas13movieappfinalproject.data.model.ListResponse
import com.ardian.tugas13movieappfinalproject.data.model.MovieResponse
import com.ardian.tugas13movieappfinalproject.data.model.TvShowResponse
import com.ardian.tugas13movieappfinalproject.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>

}