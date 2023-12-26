package com.example.belajarsqlite2;

import android.os.Parcel;
import android.os.Parcelable;

public class MhsModel implements Parcelable  {

    int id;
    String nama;
    String nim;
    String noHp;

    public MhsModel(int id, String nama, String nim, String noHp) {
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.noHp = noHp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nama);
        dest.writeString(this.nim);
        dest.writeString(this.noHp);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readInt();
        this.nama = source.readString();
        this.nim = source.readString();
        this.noHp = source.readString();
    }

    public MhsModel() {
    }

    protected MhsModel(Parcel in) {
        this.id = in.readInt();
        this.nama = in.readString();
        this.nim = in.readString();
        this.noHp = in.readString();
    }

    public static final Creator<MhsModel> CREATOR = new Creator<MhsModel>() {
        @Override
        public MhsModel createFromParcel(Parcel source) {
            return new MhsModel(source);
        }

        @Override
        public MhsModel[] newArray(int size) {
            return new MhsModel[size];
        }
    };
}

