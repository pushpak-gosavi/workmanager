package com.pushpak.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters


class CoWorkManager(
    context:Context,
    workerParameters: WorkerParameters) : Worker(context, workerParameters) {
    override fun doWork(): Result {
        println("Hello from Worker!")
        return Result.success()
    }

}