package com.example.parcelable

import android.os.Parcel
import android.os.Parcelable

data class PersnolInfo(val name: String?, val surName: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(surName)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersnolInfo> {
        override fun createFromParcel(parcel: Parcel): PersnolInfo {
            return PersnolInfo(parcel)
        }

        override fun newArray(size: Int): Array<PersnolInfo?> {
            return arrayOfNulls(size)
        }
    }

}