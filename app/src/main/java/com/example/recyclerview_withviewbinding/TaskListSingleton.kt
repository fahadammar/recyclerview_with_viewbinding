package com.example.recyclerview_withviewbinding

object TaskListSingleton {
    val taskList = listOf<Task>(
        Task("Take A Walk", timeStamp = "7:00 AM"),
        Task("Have A BreakFast", timeStamp = "10:00 AM"),
        Task("Get Ready For The Day", timeStamp = "11:00 AM"),
        Task("Check List The Tasks", timeStamp = "11:30 AM"),
        Task("Perform Task#1", timeStamp = "12:00 AM"),
        Task("Take A Short Break", timeStamp = "1:00 PM"),
        Task("Perform Task#2", timeStamp = "1:30 PM"),
        Task("Take A Short Break", timeStamp = "2:00 PM"),
        Task("Now See What's Next!!", timeStamp = "2:30 PM"),
        Task("Go For A Walk", timeStamp = "2:45 PM"),
        Task("Now Spend The Whole Day On Rest Of The Stuff", timeStamp = "3:00 PM")
    )
}