package com.example.affirmation.data

import cd.bmduka.affirmation.Model.Affirmation
import com.example.affirmation.R


class DataSource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.leroy),
            Affirmation(R.string.affirmation2, R.drawable.leroy),
            Affirmation(R.string.affirmation3, R.drawable.koda),
            Affirmation(R.string.affirmation4, R.drawable.faye),
            Affirmation(R.string.affirmation5, R.drawable.nox),
            Affirmation(R.string.affirmation6, R.drawable.moana),
            Affirmation(R.string.affirmation7, R.drawable.lola),
            Affirmation(R.string.affirmation8, R.drawable.koda),
            Affirmation(R.string.affirmation9, R.drawable.bella),
            Affirmation(R.string.affirmation10, R.drawable.moana)
        )
    }

}