package com.example.workmanager.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(context: Context, Params: WorkerParameters) : Worker(context, Params) {

    override fun doWork(): Result {
        try {
            for (i: Int in 0..600) {
                Log.i("MYTAG", "uploading $i")
            }
            return Result.success()
        }
        catch (e: Exception) {
            return Result.failure()

        }
    }
}