package com.fatihates.movieapp.data.status

import android.net.Network
import android.net.NetworkRequest
import androidx.core.widget.ContentLoadingProgressBar

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED,
}

class NetworkState(val status: Status, val msg: String) {

    companion object {
        val LOADED: NetworkState
        val LOADING: NetworkState
        val ERROR: NetworkState

        init {
            LOADED = NetworkState(Status.SUCCESS, msg = "Success!")
            LOADING = NetworkState(Status.RUNNING, msg = "Running!")
            ERROR = NetworkState(Status.FAILED, msg = "Error has occurred!")
        }
    }
}