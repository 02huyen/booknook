package com.example.booknook.ui.boards

import com.google.firebase.firestore.PropertyName
import java.io.Serializable

data class BookBoard(
    var docId: String? = null,
    @PropertyName("userId")
    var userId: String = "",
    @PropertyName("public")
    val isPublic: Boolean = true,
    @PropertyName("bookBoardTitle")
    val bookBoardTitle: String = "",
    @PropertyName("booksInBoard")
    val booksInBoard: MutableList<SavedBook> = mutableListOf()
) : Serializable