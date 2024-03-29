package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 07 13:19:41 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblSalaryDImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        SalaryMId,
        EmpId,
        Description,
        BasicSal,
        WorkDays,
        PresentDays,
        AbsentDays,
        LeaveDays,
        NetSal,
        NetPayable,
        OtHours,
        OtAmount,
        ShortHours,
        ShortAmount,
        OtherAll,
        AdvanceAmount,
        LoanAmount,
        TaxAmount,
        NetDed,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        GrossAmt,
        TblSalaryM;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }

    public static final int ID = AttributesEnum.Id.index();
    public static final int SALARYMID = AttributesEnum.SalaryMId.index();
    public static final int EMPID = AttributesEnum.EmpId.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int BASICSAL = AttributesEnum.BasicSal.index();
    public static final int WORKDAYS = AttributesEnum.WorkDays.index();
    public static final int PRESENTDAYS = AttributesEnum.PresentDays.index();
    public static final int ABSENTDAYS = AttributesEnum.AbsentDays.index();
    public static final int LEAVEDAYS = AttributesEnum.LeaveDays.index();
    public static final int NETSAL = AttributesEnum.NetSal.index();
    public static final int NETPAYABLE = AttributesEnum.NetPayable.index();
    public static final int OTHOURS = AttributesEnum.OtHours.index();
    public static final int OTAMOUNT = AttributesEnum.OtAmount.index();
    public static final int SHORTHOURS = AttributesEnum.ShortHours.index();
    public static final int SHORTAMOUNT = AttributesEnum.ShortAmount.index();
    public static final int OTHERALL = AttributesEnum.OtherAll.index();
    public static final int ADVANCEAMOUNT = AttributesEnum.AdvanceAmount.index();
    public static final int LOANAMOUNT = AttributesEnum.LoanAmount.index();
    public static final int TAXAMOUNT = AttributesEnum.TaxAmount.index();
    public static final int NETDED = AttributesEnum.NetDed.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int GROSSAMT = AttributesEnum.GrossAmt.index();
    public static final int TBLSALARYM = AttributesEnum.TblSalaryM.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblSalaryDImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblSalaryD");
    }

    /**
     * Gets the attribute value for Id, using the alias name Id.
     * @return the value of Id
     */
    public BigDecimal getId() {
        return (BigDecimal) getAttributeInternal(ID);
    }

    /**
     * Sets <code>value</code> as the attribute value for Id.
     * @param value value to set the Id
     */
    public void setId(BigDecimal value) {
        setAttributeInternal(ID, value);
    }

    /**
     * Gets the attribute value for SalaryMId, using the alias name SalaryMId.
     * @return the value of SalaryMId
     */
    public BigDecimal getSalaryMId() {
        return (BigDecimal) getAttributeInternal(SALARYMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalaryMId.
     * @param value value to set the SalaryMId
     */
    public void setSalaryMId(BigDecimal value) {
        setAttributeInternal(SALARYMID, value);
    }

    /**
     * Gets the attribute value for EmpId, using the alias name EmpId.
     * @return the value of EmpId
     */
    public BigDecimal getEmpId() {
        return (BigDecimal) getAttributeInternal(EMPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmpId.
     * @param value value to set the EmpId
     */
    public void setEmpId(BigDecimal value) {
        setAttributeInternal(EMPID, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for BasicSal, using the alias name BasicSal.
     * @return the value of BasicSal
     */
    public BigDecimal getBasicSal() {
        return (BigDecimal) getAttributeInternal(BASICSAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for BasicSal.
     * @param value value to set the BasicSal
     */
    public void setBasicSal(BigDecimal value) {
        setAttributeInternal(BASICSAL, value);
    }

    /**
     * Gets the attribute value for WorkDays, using the alias name WorkDays.
     * @return the value of WorkDays
     */
    public BigDecimal getWorkDays() {
        return (BigDecimal) getAttributeInternal(WORKDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for WorkDays.
     * @param value value to set the WorkDays
     */
    public void setWorkDays(BigDecimal value) {
        setAttributeInternal(WORKDAYS, value);
    }

    /**
     * Gets the attribute value for PresentDays, using the alias name PresentDays.
     * @return the value of PresentDays
     */
    public BigDecimal getPresentDays() {
        return (BigDecimal) getAttributeInternal(PRESENTDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PresentDays.
     * @param value value to set the PresentDays
     */
    public void setPresentDays(BigDecimal value) {
        setAttributeInternal(PRESENTDAYS, value);
    }

    /**
     * Gets the attribute value for AbsentDays, using the alias name AbsentDays.
     * @return the value of AbsentDays
     */
    public BigDecimal getAbsentDays() {
        return (BigDecimal) getAttributeInternal(ABSENTDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for AbsentDays.
     * @param value value to set the AbsentDays
     */
    public void setAbsentDays(BigDecimal value) {
        setAttributeInternal(ABSENTDAYS, value);
    }

    /**
     * Gets the attribute value for LeaveDays, using the alias name LeaveDays.
     * @return the value of LeaveDays
     */
    public BigDecimal getLeaveDays() {
        return (BigDecimal) getAttributeInternal(LEAVEDAYS);
    }

    /**
     * Sets <code>value</code> as the attribute value for LeaveDays.
     * @param value value to set the LeaveDays
     */
    public void setLeaveDays(BigDecimal value) {
        setAttributeInternal(LEAVEDAYS, value);
    }

    /**
     * Gets the attribute value for NetSal, using the alias name NetSal.
     * @return the value of NetSal
     */
    public BigDecimal getNetSal() {
        return (BigDecimal) getAttributeInternal(NETSAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetSal.
     * @param value value to set the NetSal
     */
    public void setNetSal(BigDecimal value) {
        setAttributeInternal(NETSAL, value);
    }

    /**
     * Gets the attribute value for NetPayable, using the alias name NetPayable.
     * @return the value of NetPayable
     */
    public BigDecimal getNetPayable() {
        return (BigDecimal) getAttributeInternal(NETPAYABLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetPayable.
     * @param value value to set the NetPayable
     */
    public void setNetPayable(BigDecimal value) {
        setAttributeInternal(NETPAYABLE, value);
    }

    /**
     * Gets the attribute value for OtHours, using the alias name OtHours.
     * @return the value of OtHours
     */
    public BigDecimal getOtHours() {
        return (BigDecimal) getAttributeInternal(OTHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtHours.
     * @param value value to set the OtHours
     */
    public void setOtHours(BigDecimal value) {
        setAttributeInternal(OTHOURS, value);
    }

    /**
     * Gets the attribute value for OtAmount, using the alias name OtAmount.
     * @return the value of OtAmount
     */
    public BigDecimal getOtAmount() {
        return (BigDecimal) getAttributeInternal(OTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtAmount.
     * @param value value to set the OtAmount
     */
    public void setOtAmount(BigDecimal value) {
        setAttributeInternal(OTAMOUNT, value);
    }

    /**
     * Gets the attribute value for ShortHours, using the alias name ShortHours.
     * @return the value of ShortHours
     */
    public BigDecimal getShortHours() {
        return (BigDecimal) getAttributeInternal(SHORTHOURS);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortHours.
     * @param value value to set the ShortHours
     */
    public void setShortHours(BigDecimal value) {
        setAttributeInternal(SHORTHOURS, value);
    }

    /**
     * Gets the attribute value for ShortAmount, using the alias name ShortAmount.
     * @return the value of ShortAmount
     */
    public BigDecimal getShortAmount() {
        return (BigDecimal) getAttributeInternal(SHORTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShortAmount.
     * @param value value to set the ShortAmount
     */
    public void setShortAmount(BigDecimal value) {
        setAttributeInternal(SHORTAMOUNT, value);
    }

    /**
     * Gets the attribute value for OtherAll, using the alias name OtherAll.
     * @return the value of OtherAll
     */
    public BigDecimal getOtherAll() {
        return (BigDecimal) getAttributeInternal(OTHERALL);
    }

    /**
     * Sets <code>value</code> as the attribute value for OtherAll.
     * @param value value to set the OtherAll
     */
    public void setOtherAll(BigDecimal value) {
        setAttributeInternal(OTHERALL, value);
    }

    /**
     * Gets the attribute value for AdvanceAmount, using the alias name AdvanceAmount.
     * @return the value of AdvanceAmount
     */
    public BigDecimal getAdvanceAmount() {
        return (BigDecimal) getAttributeInternal(ADVANCEAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for AdvanceAmount.
     * @param value value to set the AdvanceAmount
     */
    public void setAdvanceAmount(BigDecimal value) {
        setAttributeInternal(ADVANCEAMOUNT, value);
    }

    /**
     * Gets the attribute value for LoanAmount, using the alias name LoanAmount.
     * @return the value of LoanAmount
     */
    public BigDecimal getLoanAmount() {
        return (BigDecimal) getAttributeInternal(LOANAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for LoanAmount.
     * @param value value to set the LoanAmount
     */
    public void setLoanAmount(BigDecimal value) {
        setAttributeInternal(LOANAMOUNT, value);
    }

    /**
     * Gets the attribute value for TaxAmount, using the alias name TaxAmount.
     * @return the value of TaxAmount
     */
    public BigDecimal getTaxAmount() {
        return (BigDecimal) getAttributeInternal(TAXAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxAmount.
     * @param value value to set the TaxAmount
     */
    public void setTaxAmount(BigDecimal value) {
        setAttributeInternal(TAXAMOUNT, value);
    }

    /**
     * Gets the attribute value for NetDed, using the alias name NetDed.
     * @return the value of NetDed
     */
    public BigDecimal getNetDed() {
        return (BigDecimal) getAttributeInternal(NETDED);
    }

    /**
     * Sets <code>value</code> as the attribute value for NetDed.
     * @param value value to set the NetDed
     */
    public void setNetDed(BigDecimal value) {
        setAttributeInternal(NETDED, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for GrossAmt, using the alias name GrossAmt.
     * @return the value of GrossAmt
     */
    public BigDecimal getGrossAmt() {
        return (BigDecimal) getAttributeInternal(GROSSAMT);
    }

    /**
     * Sets <code>value</code> as the attribute value for GrossAmt.
     * @param value value to set the GrossAmt
     */
    public void setGrossAmt(BigDecimal value) {
        setAttributeInternal(GROSSAMT, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblSalaryMImpl getTblSalaryM() {
        return (TblSalaryMImpl) getAttributeInternal(TBLSALARYM);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblSalaryM(TblSalaryMImpl value) {
        setAttributeInternal(TBLSALARYM, value);
    }


    /**
     * @param id key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal id) {
        return new Key(new Object[] { id });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
                        try {
                            loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessUMID"));
                        } catch(Exception ex) {
                            ex.printStackTrace();
                        }
                        
                        if (operation == DML_INSERT) {
                            setCreatedBy(loginId);
                            setUpdatedBy(loginId);
                            } else if(operation == DML_UPDATE) {
                            setUpdatedBy(loginId);
                        }
        super.doDML(operation, e);
    }
}

