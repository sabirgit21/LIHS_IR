package model.ERP.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.NClobDomain;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 07 13:02:24 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblPbpMImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        Id,
        Vno,
        Vtp,
        Dated,
        ChqNo,
        ChqDate,
        ClrDate,
        Narration,
        PblSuppId,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        BankCashId,
        Frdate,
        Todate,
        ProjectId,
        CoaWht,
        BcGlAc,
        SuppGlAc,
        TblPbpD;
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
    public static final int VNO = AttributesEnum.Vno.index();
    public static final int VTP = AttributesEnum.Vtp.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int CHQNO = AttributesEnum.ChqNo.index();
    public static final int CHQDATE = AttributesEnum.ChqDate.index();
    public static final int CLRDATE = AttributesEnum.ClrDate.index();
    public static final int NARRATION = AttributesEnum.Narration.index();
    public static final int PBLSUPPID = AttributesEnum.PblSuppId.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int BANKCASHID = AttributesEnum.BankCashId.index();
    public static final int FRDATE = AttributesEnum.Frdate.index();
    public static final int TODATE = AttributesEnum.Todate.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int COAWHT = AttributesEnum.CoaWht.index();
    public static final int BCGLAC = AttributesEnum.BcGlAc.index();
    public static final int SUPPGLAC = AttributesEnum.SuppGlAc.index();
    public static final int TBLPBPD = AttributesEnum.TblPbpD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblPbpMImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.ERP.EO.TblPbpM");
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
     * Gets the attribute value for Vno, using the alias name Vno.
     * @return the value of Vno
     */
    public Number getVno() {
        return (Number) getAttributeInternal(VNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Vno.
     * @param value value to set the Vno
     */
    public void setVno(Number value) {
        setAttributeInternal(VNO, value);
    }

    /**
     * Gets the attribute value for Vtp, using the alias name Vtp.
     * @return the value of Vtp
     */
    public String getVtp() {
        return (String) getAttributeInternal(VTP);
    }

    /**
     * Sets <code>value</code> as the attribute value for Vtp.
     * @param value value to set the Vtp
     */
    public void setVtp(String value) {
        setAttributeInternal(VTP, value);
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
     * Gets the attribute value for ChqNo, using the alias name ChqNo.
     * @return the value of ChqNo
     */
    public String getChqNo() {
        return (String) getAttributeInternal(CHQNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChqNo.
     * @param value value to set the ChqNo
     */
    public void setChqNo(String value) {
        setAttributeInternal(CHQNO, value);
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
     * Gets the attribute value for ClrDate, using the alias name ClrDate.
     * @return the value of ClrDate
     */
    public Timestamp getClrDate() {
        return (Timestamp) getAttributeInternal(CLRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ClrDate.
     * @param value value to set the ClrDate
     */
    public void setClrDate(Timestamp value) {
        setAttributeInternal(CLRDATE, value);
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
     * Gets the attribute value for PblSuppId, using the alias name PblSuppId.
     * @return the value of PblSuppId
     */
    public BigDecimal getPblSuppId() {
        return (BigDecimal) getAttributeInternal(PBLSUPPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PblSuppId.
     * @param value value to set the PblSuppId
     */
    public void setPblSuppId(BigDecimal value) {
        setAttributeInternal(PBLSUPPID, value);
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
     * Gets the attribute value for BankCashId, using the alias name BankCashId.
     * @return the value of BankCashId
     */
    public BigDecimal getBankCashId() {
        return (BigDecimal) getAttributeInternal(BANKCASHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankCashId.
     * @param value value to set the BankCashId
     */
    public void setBankCashId(BigDecimal value) {
        setAttributeInternal(BANKCASHID, value);
    }

    /**
     * Gets the attribute value for Frdate, using the alias name Frdate.
     * @return the value of Frdate
     */
    public Timestamp getFrdate() {
        return (Timestamp) getAttributeInternal(FRDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Frdate.
     * @param value value to set the Frdate
     */
    public void setFrdate(Timestamp value) {
        setAttributeInternal(FRDATE, value);
    }

    /**
     * Gets the attribute value for Todate, using the alias name Todate.
     * @return the value of Todate
     */
    public Timestamp getTodate() {
        return (Timestamp) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Todate.
     * @param value value to set the Todate
     */
    public void setTodate(Timestamp value) {
        setAttributeInternal(TODATE, value);
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
     * Gets the attribute value for CoaWht, using the alias name CoaWht.
     * @return the value of CoaWht
     */
    public BigDecimal getCoaWht() {
        return (BigDecimal) getAttributeInternal(COAWHT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaWht.
     * @param value value to set the CoaWht
     */
    public void setCoaWht(BigDecimal value) {
        setAttributeInternal(COAWHT, value);
    }

    /**
     * Gets the attribute value for BcGlAc, using the alias name BcGlAc.
     * @return the value of BcGlAc
     */
    public BigDecimal getBcGlAc() {
        return (BigDecimal) getAttributeInternal(BCGLAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for BcGlAc.
     * @param value value to set the BcGlAc
     */
    public void setBcGlAc(BigDecimal value) {
        setAttributeInternal(BCGLAC, value);
    }

    /**
     * Gets the attribute value for SuppGlAc, using the alias name SuppGlAc.
     * @return the value of SuppGlAc
     */
    public BigDecimal getSuppGlAc() {
        return (BigDecimal) getAttributeInternal(SUPPGLAC);
    }

    /**
     * Sets <code>value</code> as the attribute value for SuppGlAc.
     * @param value value to set the SuppGlAc
     */
    public void setSuppGlAc(BigDecimal value) {
        setAttributeInternal(SUPPGLAC, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblPbpD() {
        return (RowIterator) getAttributeInternal(TBLPBPD);
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

