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
// ---    Sat Nov 07 12:29:48 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblDonCrImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Dated,
        ProjectId,
        DonSetupId,
        DonTypeId,
        RecIn,
        CashBankId,
        DocNo,
        ChqDate,
        Amount,
        Narration,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        Category,
        Exp,
        TblDonSetup,
        TblDonType;
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
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DONSETUPID = AttributesEnum.DonSetupId.index();
    public static final int DONTYPEID = AttributesEnum.DonTypeId.index();
    public static final int RECIN = AttributesEnum.RecIn.index();
    public static final int CASHBANKID = AttributesEnum.CashBankId.index();
    public static final int DOCNO = AttributesEnum.DocNo.index();
    public static final int CHQDATE = AttributesEnum.ChqDate.index();
    public static final int AMOUNT = AttributesEnum.Amount.index();
    public static final int NARRATION = AttributesEnum.Narration.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int CATEGORY = AttributesEnum.Category.index();
    public static final int EXP = AttributesEnum.Exp.index();
    public static final int TBLDONSETUP = AttributesEnum.TblDonSetup.index();
    public static final int TBLDONTYPE = AttributesEnum.TblDonType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblDonCrImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblDonCr");
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
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public BigDecimal getProjectId() {
        return (BigDecimal) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(BigDecimal value) {
        setAttributeInternal(PROJECTID, value);
    }

    /**
     * Gets the attribute value for DonSetupId, using the alias name DonSetupId.
     * @return the value of DonSetupId
     */
    public BigDecimal getDonSetupId() {
        return (BigDecimal) getAttributeInternal(DONSETUPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DonSetupId.
     * @param value value to set the DonSetupId
     */
    public void setDonSetupId(BigDecimal value) {
        setAttributeInternal(DONSETUPID, value);
    }

    /**
     * Gets the attribute value for DonTypeId, using the alias name DonTypeId.
     * @return the value of DonTypeId
     */
    public BigDecimal getDonTypeId() {
        return (BigDecimal) getAttributeInternal(DONTYPEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DonTypeId.
     * @param value value to set the DonTypeId
     */
    public void setDonTypeId(BigDecimal value) {
        setAttributeInternal(DONTYPEID, value);
    }

    /**
     * Gets the attribute value for RecIn, using the alias name RecIn.
     * @return the value of RecIn
     */
    public String getRecIn() {
        return (String) getAttributeInternal(RECIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for RecIn.
     * @param value value to set the RecIn
     */
    public void setRecIn(String value) {
        setAttributeInternal(RECIN, value);
    }

    /**
     * Gets the attribute value for CashBankId, using the alias name CashBankId.
     * @return the value of CashBankId
     */
    public BigDecimal getCashBankId() {
        return (BigDecimal) getAttributeInternal(CASHBANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CashBankId.
     * @param value value to set the CashBankId
     */
    public void setCashBankId(BigDecimal value) {
        setAttributeInternal(CASHBANKID, value);
    }

    /**
     * Gets the attribute value for DocNo, using the alias name DocNo.
     * @return the value of DocNo
     */
    public String getDocNo() {
        return (String) getAttributeInternal(DOCNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DocNo.
     * @param value value to set the DocNo
     */
    public void setDocNo(String value) {
        setAttributeInternal(DOCNO, value);
    }

    /**
     * Gets the attribute value for ChqDate, using the alias name ChqDate.
     * @return the value of ChqDate
     */
    public Timestamp getChqDate() {
        return (Timestamp) getAttributeInternal(CHQDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqDate.
     * @param value value to set the ChqDate
     */
    public void setChqDate(Timestamp value) {
        setAttributeInternal(CHQDATE, value);
    }

    /**
     * Gets the attribute value for Amount, using the alias name Amount.
     * @return the value of Amount
     */
    public BigDecimal getAmount() {
        return (BigDecimal) getAttributeInternal(AMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Amount.
     * @param value value to set the Amount
     */
    public void setAmount(BigDecimal value) {
        setAttributeInternal(AMOUNT, value);
    }

    /**
     * Gets the attribute value for Narration, using the alias name Narration.
     * @return the value of Narration
     */
    public String getNarration() {
        return (String) getAttributeInternal(NARRATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Narration.
     * @param value value to set the Narration
     */
    public void setNarration(String value) {
        setAttributeInternal(NARRATION, value);
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
     * Gets the attribute value for Category, using the alias name Category.
     * @return the value of Category
     */
    public String getCategory() {
        return (String) getAttributeInternal(CATEGORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Category.
     * @param value value to set the Category
     */
    public void setCategory(String value) {
        setAttributeInternal(CATEGORY, value);
    }

    /**
     * Gets the attribute value for Exp, using the alias name Exp.
     * @return the value of Exp
     */
    public BigDecimal getExp() {
        return (BigDecimal) getAttributeInternal(EXP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Exp.
     * @param value value to set the Exp
     */
    public void setExp(BigDecimal value) {
        setAttributeInternal(EXP, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblDonSetupImpl getTblDonSetup() {
        return (TblDonSetupImpl) getAttributeInternal(TBLDONSETUP);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblDonSetup(TblDonSetupImpl value) {
        setAttributeInternal(TBLDONSETUP, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public TblDonTypeImpl getTblDonType() {
        return (TblDonTypeImpl) getAttributeInternal(TBLDONTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblDonType(TblDonTypeImpl value) {
        setAttributeInternal(TBLDONTYPE, value);
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

