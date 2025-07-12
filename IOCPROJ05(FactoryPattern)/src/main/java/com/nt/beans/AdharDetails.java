package com.nt.beans;

public class AdharDetails {
private long adhar;
public AdharDetails(long adhar) {
	this.adhar=adhar;
	}
@Override
public String toString() {
    return "AdharDetails [adhar=" + adhar + "]";
}
}
