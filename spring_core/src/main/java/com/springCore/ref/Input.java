package com.springCore.ref;

public class Input {
	private String loan_id;
	private float loan_amount;
	private Applicant_details appl_detail;

	public String getLoan_id() {
		return loan_id;
	}

	public void setLoan_id(String loan_id) {
		this.loan_id = loan_id;
	}

	public float getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(float loan_amount) {
		this.loan_amount = loan_amount;
	}

	public Applicant_details getAppl_detail() {
		return appl_detail;
	}

	public void setAppl_detail(Applicant_details appl_detail) {
		this.appl_detail = appl_detail;
	}

	public Input() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Input [loan_id=" + loan_id + ", loan_amount=" + loan_amount + ", appl_detail=" + appl_detail + "]";
	}

	public Input(String loan_id, float loan_amount, Applicant_details appl_detail) {
		super();
		this.loan_id = loan_id;
		this.loan_amount = loan_amount;
		this.appl_detail = appl_detail;
	}

}
