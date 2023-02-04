package com.testsalt.entity;

import org.w3c.dom.Text;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "konsumen")
public class Konsumen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 255, nullable = true)
    private String nama;

    @Column(columnDefinition = "TEXT", nullable = true)
    private String alamat;

    @Column(columnDefinition = "CHAR(100)", nullable = true)
    private String kota;

    @Column(columnDefinition = "CHAR(100)", nullable = true)
    private String provinsi;

    @Column(columnDefinition = "DATETIME", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private String tgl_registrasi;

    @Column(columnDefinition = "CHAR(100)", nullable = true)
    private String status;

    public Konsumen()
    {

    }

    public int getId() {
        return id;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getKota() {
        return kota;
    }

    public String getNama() {
        return nama;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public String getStatus() {
        return status;
    }

    public String getTgl_registrasi() {
        return tgl_registrasi;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTgl_registrasi(String tgl_registrasi) {
        this.tgl_registrasi = tgl_registrasi;
    }
}
