package ch.desm.middleware.app.core.component.petrinet.obermattlangnau;

import org.apache.log4j.Logger;

abstract class OMLPetrinetEndpointExportBase {
    public int W1_keine_Endlage_minus;
    public int Fstr_ef_E_Halt;
    public int Fstr_ef_E_Fahrt1;
    public int Fstr_ef_aufgeloest;
    public int Fstr_ef_verschlossen;
    public int BL_OM_LN_Grundstlg_v;
    public int Fstr_ef_P6;
    public int Fstr_ef_geprueft2;
    public int Iso_ef_Zug_ausfahren;
    public int Fstr_ef_P1;
    public int Fstr_ef_P2;
    public int Iso_ef_belegt;
    public int Iso_ef_Zug_einfahren;
    public int Fstr_ef_geprueft1;
    public int BL_OM_LN_1;
    public int BL_OM_LN_2;
    public int Fstr_ef_Zug_eingefahren;
    public int BL_OM_LN_belegt_n;
    public int Iso_ef_frei;
    public int BL_OM_LN_Grundstlg_n;
    public int BL_OM_LN_3;
    public int Fstr_ef_Stoerung_E;
    public int BL_OM_LN_vorgebl_v;
    public int BL_ZB_OM_Grundstlg_v;
    public int BL_ZB_OM_belegt_n;
    public int Stw_WS_Sperrm_aus;
    public int Stw_WS_Sperrm_ein;
    public int Fstr_fe_verschlossen;
    public int BL_ZB_OM_3;
    public int Fstr_fe_geprueft;
    public int Fstr_gf_geprueft2;
    public int Stw_FSS_Sperrm_aus;
    public int Fstr_fe_aufgeloest;
    public int BL_OM_LN_RMM_nLN;
    public int BL_ZB_OM_2;
    public int BL_ZB_OM_Grundstlg_n;
    public int BL_OM_LN_belegt_v;
    public int Fstr_fe_F_Halt;
    public int BL_ZB_OM_vorgebl_v;
    public int BL_ZB_OM_belegt_v;
    public int BL_OM_LN_vorgebl_n;
    public int BL_ZB_OM_vorgebl_n;
    public int Stw_FSS_Kuppelm_aus;
    public int BL_ZB_OM_1;
    public int Stw_FSS_Kuppelm_ein;
    public int Stw_P10;
    public int Stw_P11;
    public int Fstr_fe_P1;
    public int Fstr_fe_F_Fahrt1;
    public int BL_ZB_OM_RMM_nZB;
    public int Fstr_fe_Zug_eingefahren;
    public int Stw_FSS_Sperrm_ein;
    public int Fstr_fe_P2b;
    public int Fstr_fe_Stoerung_F;
    public int Fstr_fe_P2;
    public int Fstr_gf_aufgeloest;
    public int Fstr_gf_G_Fahrt3;
    public int Fstr_gf_G_Halt;
    public int Fstr_gf_Zug_eingefahren;
    public int Fstr_gf_geprueft1;
    public int Fstr_gf_Stoerung_G;
    public int Fstr_gf_verschlossen;
    public int Fstr_fg_F_Fahrt3;
    public int Iso_egf_Zug_ausfahren;
    public int Iso_cd_frei;
    public int Iso_1_frei;
    public int Iso_cd_belegt;
    public int Iso_cd_Zug_einfahren;
    public int Fstr_fg_geprueft0;
    public int Iso_cd_Zug_ausfahren;
    public int Iso_gf_Zug_einfahren;
    public int Iso_egf_Zug_einfahren;
    public int Fstr_gf_P4;
    public int Lampen_1_G_VS_Stoer;
    public int Iso_gf_Zug_ausfahren;
    public int Fstr_fg_Stoerung_F;
    public int Iso_gf_belegt;
    public int Lampen_1_F_gruenFB1;
    public int Iso_gf_frei;
    public int Lampen_1_BL_vZB_weiss;
    public int Fstr_fg_aufgeloest;
    public int Iso_1_Zug_einfahren;
    public int Iso_egf_frei;
    public int Fstr_fg_F_Halt;
    public int Lampen_1_F_VS_Stoer;
    public int Fstr_fg_P1;
    public int Fstr_fg_P2;
    public int Fstr_fg_Zug_eingefahren;
    public int Fstr_fg_verschlossen;
    public int Fstr_fg_geprueft1;
    public int Fstr_fg_geprueft2;
    public int Iso_egf_belegt;
    public int Iso_1_Zug_ausfahren;
    public int Iso_1_belegt;
    public int Lampen_1_BL_vLN_rot;
    public int Lampen_1_Fstr_ef;
    public int Lampen_1_BL_nZB_rot;
    public int Lampen_1_BL_nZB_weiss;
    public int Lampen_1_BL_vZB_rot;
    public int Lampen_1_BL_vLN_weiss;
    public int Lampen_1_BL_nLN_rot;
    public int Lampen_1_BL_nLN_weiss;
    public int Lampen_1_Fstr_gf;
    public int EMM_geprueft2A1;
    public int ext_Vb_Ueberw_W1_plus;
    public int ext_Vb_G_VS_Lampe_Warn_def;
    public int ext_Vb_F_VS_Lampe_Warn_def;
    public int EMM_EMM_Grundstlg;
    public int ext_Vb_G_VS_Lampe_Fahrt_def;
    public int EMM_EMM_W10_pA1;
    public int ext_Vb_F_VS_Lampe_Fahrt_def;
    public int EMM_OM_E_Fahrt;
    public int EMM_geprueft1A2;
    public int EMM_geprueft2A2;
    public int EMM_EMM_W7_mA1;
    public int EMM_geprueft1A1;
    public int ext_Vb_Ueberw_W1_minus;
    public int EMM_EMM_W10_pA2;
    public int EMM_EMM_W10_mA5;
    public int EMM_EMM_W10_mE4;
    public int EMM_D_FB1;
    public int EMM_geprueft1A4;
    public int EMM_EMM_W9_mA5;
    public int EMM_EMM_W8_mA5;
    public int EMM_geprueft1A5;
    public int EMM_EMM_W9_pA3;
    public int EMM_geprueft2A3;
    public int EMM_EMM_W9_mA4;
    public int EMM_EMM_W7_mE1;
    public int EMM_EMM_W9_mE5;
    public int EMM_EMM_W8_mE5;
    public int EMM_geprueft1A3;
    public int EMM_geprueft2A5;
    public int EMM_geprueft1E5;
    public int EMM_EMM_W8_pA4;
    public int EMM_EMM_W10_mA3;
    public int EMM_EMM_W10_pE1;
    public int EMM_EMM_W10_pE2;
    public int EMM_EMM_W7_pE2;
    public int EMM_EMM_W9_pE3;
    public int EMM_geprueft2A4;
    public int EMM_geprueft1E3;
    public int EMM_EMM_W7_pA2;
    public int EMM_geprueft1E4;
    public int EMM_EMM_W8_pE4;
    public int EMM_geprueft1E1;
    public int EMM_EMM_W9_mE4;
    public int EMM_EMM_W10_mA4;
    public int EMM_geprueft1E2;
    public int EMM_EMM_W10_mE3;
    public int EMM_C_FB2;
    public int LN_geprueft1A5;
    public int EMM_EMM_W10_mE5;
    public int EMM_C_Halt;
    public int EMM_D_FB2;
    public int EMM_C_Fahrt;
    public int EMM_C_FB1;
    public int EMM_D_Fahrt;
    public int EMM_D_Halt;
    public int LN_LN_W5_pA3;
    public int LN_LN_W1_pA5;
    public int LN_LN_W4_pA5;
    public int LN_LN_W2_pA2;
    public int LN_LN_W1_pE4;
    public int LN_geprueft1E5;
    public int LN_geprueft1E2;
    public int LN_EMM_Grundstlg;
    public int LN_LN_W1_pA3;
    public int LN_LN_W1_mA1;
    public int LN_geprueft1E4;
    public int LN_geprueft2A4;
    public int LN_LN_W3_pA4;
    public int LN_LN_W3_mA5;
    public int LN_LN_W2_mA5;
    public int LN_geprueft2A5;
    public int LN_geprueft1A4;
    public int LN_geprueft1E3;
    public int LN_geprueft1A3;
    public int LN_LN_W1_pA4;
    public int LN_LN_W1_pA2;
    public int LN_geprueft2A3;
    public int LN_geprueft1A1;
    public int LN_LN_W3_pA3;
    public int LN_ce_belegt;
    public int LN_geprueft2A2;
    public int LN_LN_W2_mA3;
    public int LN_geprueft2A1;
    public int LN_LN_W5_mA4;
    public int LN_LN_W2_mA4;
    public int LN_geprueft1A2;
    public int LN_geprueft1E1;
    public int LN_LN_W1_pA6;
    public int LN_geprueft2A6;
    public int LN_geprueft1A6;
    public int LN_LN_W3_mE5;
    public int LN_LN_W6_mA6;
    public int LN_LN_W6_mA5;
    public int LN_LN_W3_mA6;
    public int LN_LN_W4_pA6;
    public int LN_LN_W2_mA6;
    public int LN_E_FB1;
    public int LN_LN_W1_mE1;
    public int LN_C26_Fahrt;
    public int ZB_C_Fahrt;
    public int ZB_geprueft1A1;
    public int LN_LN_W1_pE2;
    public int LN_LN_W4_pE5;
    public int LN_geprueft1E6;
    public int LN_LN_W3_mE6;
    public int LN_LN_W3_pE3;
    public int LN_LN_W5_pE3;
    public int LN_LN_W1_pE5;
    public int LN_LN_W2_pE2;
    public int LN_LN_W1_pE3;
    public int LN_LN_W6_mE5;
    public int LN_LN_W2_mE5;
    public int LN_LN_W2_mE4;
    public int LN_LN_W3_pE4;
    public int LN_C1_Halt;
    public int LN_C26_FB2;
    public int LN_C26_Halt;
    public int LN_LN_W2_mE3;
    public int LN_E_FB2;
    public int LN_LN_W6_mE6;
    public int LN_LN_W2_mE6;
    public int LN_LN_W1_pE6;
    public int LN_LN_W5_mE4;
    public int LN_E_Fahrt;
    public int LN_e_Halt;
    public int LN_LN_W4_pE6;
    public int LN_C26_FB1;
    public int LN_C1_Fahrt2;
    public int ZB_geprueft1A2;
    public int ZB_cd_belegt;
    public int ZB_D_Fahrt;
    public int ZB_ZB_W2_pE2;
    public int ZB_geprueft1E2;
    public int ZB_EMM_Grundstlg;
    public int ZB_ZB_W2_mE1;
    public int ZB_ZB_W2_mA1;
    public int ZB_ZB_W2_pA2;
    public int W1_keine_Endlage_plus;
    public int W1_Endlage_plus;
    public int W1_Endlage_minus;
    public int W1_gestoert_p;
    public int W1_gestoert_m;
    public int Lampen_P34;
    public int Lampen_P12;
    public int Lampen_1_FBV_vLN;
    public int Lampen_P13;
    public int Lampen_Iso_cd_aus;
    public int Lampen_P33;
    public int Lampen_1_WS1_Ueberw;
    public int Lampen_P48;
    public int Lampen_P4;
    public int Lampen_P6;
    public int Lampen_2_Signal;
    public int Lampen_1_F_rot;
    public int Lampen_P8;
    public int Lampen_P112;
    public int Lampen_P23;
    public int Lampen_P41;
    public int Lampen_P26;
    public int Lampen_1_FBV_vZB;
    public int Lampen_P30;
    public int Lampen_P20;
    public int Lampen_P35;
    public int Lampen_P38;
    public int Lampen_P1;
    public int Lampen_P49;
    public int Lampen_2_Weiche;
    public int Lampen_P32;
    public int Lampen_1_WS1_Freig;
    public int Lampen_2_Block;
    public int Lampen_1_Stoer_Wecker;
    public int Lampen_P15;
    public int Lampen_P16;
    public int Lampen_P17;
    public int Lampen_P21;
    public int Lampen_Iso_cd_ein;
    public int Lampen_P18;
    public int Lampen_P22;
    public int Lampen_P117;
    public int Lampen_P27;
    public int Lampen_P39;
    public int Lampen_P40;
    public int Lampen_P135;
    public int Kontakte_6_NT_W1;
    public int Kontakte_7_WS1_1;
    public int Kontakte_8_FSS_10EG;
    public int Lampen_Iso_1_ein;
    public int Kontakte_7_WS1_plus;
    public int Lampen_Iso_ef_aus;
    public int Kontakte_6_Gleist_EMM;
    public int Kontakte_8_FSS_30EG;
    public int Kontakte_6_FBF_nZB;
    public int Kontakte_6_FBF_nLN;
    public int Kontakte_8_FSS_45EG;
    public int Lampen_Iso_1_aus;
    public int Kontakte_6_FBA_nZB;
    public int Kontakte_6_BLU_EG;
    public int Lampen_Iso_egf_aus;
    public int Kontakte_6_Gleist_ZB;
    public int Lampen_Iso_ef_ein;
    public int Kontakte_6_ISU_Sign;
    public int Kontakte_6_NAL;
    public int Kontakte_7_WS1_minus;
    public int Kontakte_6_RM_nLN;
    public int Kontakte_6_RM_nZB;
    public int Lampen_Iso_egf_ein;
    public int Kontakte_6_FBA_nLN;
    public int Kontakte_8_FSS_90F;
    public int Kontakte_8_FSS_30F;
    public int Kontakte_8_FSS_10F;
    public int Kontakte_8_FSS_90EG;
    public int Kontakte_8_FSS_45F;
    public int ILTIS_P130;
    public int ILTIS_RM_moeglich1;
    public int ILTIS_RM_LN_OM;
    public int ILTIS_RM_moeglich2;
    public int ILTIS_rueckmelden_ZB_OM;
    public int ILTIS_P230;
    public int ILTIS_RM_ZB_OM;
    public int ZB_D_Halt;
    public int ZB_geprueft2A2;
    public int ZB_C_Halt;
    public int ZB_geprueft2A1;
    public int ZB_geprueft1E1;
    public int ZB_D_FB1;
    public int ZB_D_FB2;
    public int ILTIS_EMM_1_833;
    public int ILTIS_EMM_3_833;
    public int ILTIS_EMM_833_1;
    public int ZB_ZB_W1_pE2;
    public int ILTIS_EMM_2_833;
    public int ILTIS_EMM_4_833;
    public int ILTIS_EMM_5_833;
    public int ILTIS_ZB_2_138;
    public int ILTIS_EMM_833_5;
    public int ILTIS_ZB_138_1;
    public int ILTIS_ZB_138_2;
    public int ILTIS_LN_834_1;
    public int ILTIS_EMM_833_3;
    public int ILTIS_EMM_833_4;
    public int ZB_C_FB1;
    public int ILTIS_LN_834_3;
    public int ILTIS_EMM_833_2;
    public int ZB_ZB_W1_mA1;
    public int ILTIS_ZB_1_138;
    public int ILTIS_LN_834_4;
    public int ILTIS_LN_834_2;
    public int ZB_C_FB2;
    public int ZB_ZB_W1_mE1;
    public int ZB_ZB_W1_pA2;
    public int ILTIS_festhalten_vZB;
    public int ILTIS_festgehalten_v_ZB;
    public int ILTIS_LN_1_834;
    public int ILTIS_LN_834_5;
    public int ILTIS_LN_6_834;
    public int ILTIS_LN_4_834;
    public int ILTIS_LN_3_834;
    public int ILTIS_rueckmelden_LN_OM;
    public int ILTIS_freigeben_vLN;
    public int ILTIS_festhalten_vLN;
    public int ILTIS_freigeben_vZB;
    public int ILTIS_LN_2_834;
    public int ILTIS_festgehalten_vLN;
    public int ILTIS_anfordern_vZB;
    public int ILTIS_freigegeben_vZB;
    public int ILTIS_LN_834_6;
    public int ILTIS_anfordern_vLN;
    public int ILTIS_LN_5_834;
    public int ILTIS_freigegeben_vLN;

    //unused places
    public int Kontakte_6_Anf_Durchf_nEMM;
    public int Kontakte_6_Wecker_absch;
    public int Kontakte_6_Wbel_ein;
    public int Kontakte_6_Zeitsch_Umg;
    public int Kontakte_8_FSS_0EGF;
    public int Kontakte_8_FSS_1EGF;
    public int Kontakte_8_FSS_80EG;
    public int Kontakte_8_FSS_80F;
    public int Kontakte_8_FSS_0EGF_1;
    public int ext_Vb_FBZ_vLN;
    public int ext_Vb_RM_vLN;
    public int ext_Vb_FBZ_vZB;
    public int ext_Vb_RM_vZB;
    public int ext_Vb_FBA_vEMM;
    public int ext_Vb_vorblocken_vLN;
    public int ext_Vb_abl_vEMM;
    public int ext_Vb_abl_vLN;
    public int ext_Vb_abl_vZB;
    public int ext_Vb_abl_nEMM;
    public int ext_Vb_abl_nLN;
    public int ext_Vb_abl_nZB;
    public int ext_Vb_Ueberw_def_aus;
    public int ext_Vb_Stellstrom_def_aus;
    public int ext_Vb_F_Lampe_rot_def;
    public int ext_Vb_D_Lamt_def;
    public int ext_Vb_G_Lampe_gruenFB3_def;
    public int ext_Vb_E_Lampe_rot_def;
    public int ext_Vb_G_Lampe_rot_def;
    public int ext_Vb_F_Lampe_gruenFB3_def;
    public int ext_Vb_E_Lampe_gruenFB1_def;
    public int ext_Vb_blocken_vLN;
    public int ext_Vb_blocken_vZB;
    public int ext_Vb_vorblocken_vZB;

    public void main() {
        init();
        for(;;) {
            readSensors();
            while(fireOneTransition()) {
                writeActors();
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public boolean canFire(String s) {
        return true;
    }

    public void fire(String s) {
        System.out.println(s);
    }

    public void readSensors() {
        //Iso_ef_Zug_ausfahren = ?
        //Iso_ef_Zug_einfahren = ?
        //Fstr_ef_Stoerung_E = ?
        //Fstr_fe_Stoerung_F = ?
        //Fstr_gf_Stoerung_G = ?
        //Iso_egf_Zug_ausfahren = ?
        //Iso_cd_Zug_einfahren = ?
        //Iso_cd_Zug_ausfahren = ?
        //Iso_gf_Zug_einfahren = ?
        //Iso_egf_Zug_einfahren = ?
        //Iso_gf_Zug_ausfahren = ?
        //Fstr_fg_Stoerung_F = ?
        //Iso_1_Zug_einfahren = ?
        //Iso_1_Zug_ausfahren = ?
        //ext_Vb_Ueberw_W1_plus = ?
        //ext_Vb_G_VS_Lampe_Warn_def = ?
        //ext_Vb_F_VS_Lampe_Warn_def = ?
        //ext_Vb_G_VS_Lampe_Fahrt_def = ?
        //ext_Vb_F_VS_Lampe_Fahrt_def = ?
        //EMM_OM_E_Fahrt = ?
        //ext_Vb_Ueberw_W1_minus = ?
        //LN_ce_belegt = ?
        //ZB_cd_belegt = ?
        //Lampen_P41 = ?
        //Kontakte_6_NT_W1 = ?
        //Kontakte_7_WS1_1 = ?
        //Kontakte_8_FSS_10EG = ?
        //Kontakte_7_WS1_plus = ?
        //Kontakte_6_Gleist_EMM = ?
        //Kontakte_8_FSS_30EG = ?
        //Kontakte_6_FBF_nZB = ?
        //Kontakte_6_FBF_nLN = ?
        //Kontakte_8_FSS_45EG = ?
        //Kontakte_6_FBA_nZB = ?
        //Kontakte_6_BLU_EG = ?
        //Kontakte_6_Gleist_ZB = ?
        //Kontakte_6_ISU_Sign = ?
        //Kontakte_6_NAL = ?
        //Kontakte_7_WS1_minus = ?
        //Kontakte_6_RM_nLN = ?
        //Kontakte_6_RM_nZB = ?
        //Kontakte_6_FBA_nLN = ?
        //Kontakte_8_FSS_90F = ?
        //Kontakte_8_FSS_30F = ?
        //Kontakte_8_FSS_10F = ?
        //Kontakte_8_FSS_90EG = ?
        //Kontakte_8_FSS_45F = ?
        //ILTIS_rueckmelden_ZB_OM = ?
        //ILTIS_EMM_1_833 = ?
        //ILTIS_EMM_3_833 = ?
        //ILTIS_EMM_833_1 = ?
        //ILTIS_EMM_2_833 = ?
        //ILTIS_EMM_4_833 = ?
        //ILTIS_EMM_5_833 = ?
        //ILTIS_ZB_2_138 = ?
        //ILTIS_EMM_833_5 = ?
        //ILTIS_ZB_138_1 = ?
        //ILTIS_ZB_138_2 = ?
        //ILTIS_LN_834_1 = ?
        //ILTIS_EMM_833_3 = ?
        //ILTIS_EMM_833_4 = ?
        //ILTIS_LN_834_3 = ?
        //ILTIS_EMM_833_2 = ?
        //ILTIS_ZB_1_138 = ?
        //ILTIS_LN_834_4 = ?
        //ILTIS_LN_834_2 = ?
        //ILTIS_festhalten_vZB = ?
        //ILTIS_LN_1_834 = ?
        //ILTIS_LN_834_5 = ?
        //ILTIS_LN_6_834 = ?
        //ILTIS_LN_4_834 = ?
        //ILTIS_LN_3_834 = ?
        //ILTIS_rueckmelden_LN_OM = ?
        //ILTIS_freigeben_vLN = ?
        //ILTIS_festhalten_vLN = ?
        //ILTIS_freigeben_vZB = ?
        //ILTIS_LN_2_834 = ?
        //ILTIS_anfordern_vZB = ?
        //ILTIS_LN_834_6 = ?
        //ILTIS_anfordern_vLN = ?
        //ILTIS_LN_5_834 = ?
    }
    public void writeActors() {
        //myData.Lampen_1_G_VS_Stoer = Lampen_1_G_VS_Stoer;
        Lampen_1_G_VS_Stoer = 0;
        //myData.Lampen_1_F_VS_Stoer = Lampen_1_F_VS_Stoer;
        Lampen_1_F_VS_Stoer = 0;
        //myData.EMM_D_FB1 = EMM_D_FB1;
        EMM_D_FB1 = 0;
        //myData.EMM_C_FB2 = EMM_C_FB2;
        EMM_C_FB2 = 0;
        //myData.EMM_D_FB2 = EMM_D_FB2;
        EMM_D_FB2 = 0;
        //myData.EMM_C_FB1 = EMM_C_FB1;
        EMM_C_FB1 = 0;
        //myData.LN_E_FB1 = LN_E_FB1;
        LN_E_FB1 = 0;
        //myData.LN_C26_FB2 = LN_C26_FB2;
        LN_C26_FB2 = 0;
        //myData.LN_E_FB2 = LN_E_FB2;
        LN_E_FB2 = 0;
        //myData.LN_C26_FB1 = LN_C26_FB1;
        LN_C26_FB1 = 0;
        //myData.Lampen_1_Stoer_Wecker = Lampen_1_Stoer_Wecker;
        Lampen_1_Stoer_Wecker = 0;
        //myData.ZB_D_FB1 = ZB_D_FB1;
        ZB_D_FB1 = 0;
        //myData.ZB_D_FB2 = ZB_D_FB2;
        ZB_D_FB2 = 0;
        //myData.ZB_C_FB1 = ZB_C_FB1;
        ZB_C_FB1 = 0;
        //myData.ZB_C_FB2 = ZB_C_FB2;
        ZB_C_FB2 = 0;
    }
    public void init() {
        W1_keine_Endlage_minus = 0;
        Fstr_ef_E_Halt = 1;
        Fstr_ef_E_Fahrt1 = 0;
        Fstr_ef_aufgeloest = 1;
        Fstr_ef_verschlossen = 0;
        BL_OM_LN_Grundstlg_v = 0;
        Fstr_ef_P6 = 0;
        Fstr_ef_geprueft2 = 0;
        Iso_ef_Zug_ausfahren = 0;
        Fstr_ef_P1 = 0;
        Fstr_ef_P2 = 0;
        Iso_ef_belegt = 0;
        Iso_ef_Zug_einfahren = 0;
        Fstr_ef_geprueft1 = 0;
        BL_OM_LN_1 = 0;
        BL_OM_LN_2 = 0;
        Fstr_ef_Zug_eingefahren = 0;
        BL_OM_LN_belegt_n = 0;
        Iso_ef_frei = 1;
        BL_OM_LN_Grundstlg_n = 1;
        BL_OM_LN_3 = 0;
        Fstr_ef_Stoerung_E = 0;
        BL_OM_LN_vorgebl_v = 0;
        BL_ZB_OM_Grundstlg_v = 0;
        BL_ZB_OM_belegt_n = 0;
        Stw_WS_Sperrm_aus = 1;
        Stw_WS_Sperrm_ein = 0;
        Fstr_fe_verschlossen = 0;
        BL_ZB_OM_3 = 0;
        Fstr_fe_geprueft = 0;
        Fstr_gf_geprueft2 = 0;
        Stw_FSS_Sperrm_aus = 1;
        Fstr_fe_aufgeloest = 1;
        BL_OM_LN_RMM_nLN = 0;
        BL_ZB_OM_2 = 0;
        BL_ZB_OM_Grundstlg_n = 1;
        BL_OM_LN_belegt_v = 0;
        Fstr_fe_F_Halt = 1;
        BL_ZB_OM_vorgebl_v = 0;
        BL_ZB_OM_belegt_v = 0;
        BL_OM_LN_vorgebl_n = 0;
        BL_ZB_OM_vorgebl_n = 0;
        Stw_FSS_Kuppelm_aus = 1;
        BL_ZB_OM_1 = 0;
        Stw_FSS_Kuppelm_ein = 0;
        Stw_P10 = 0;
        Stw_P11 = 0;
        Fstr_fe_P1 = 0;
        Fstr_fe_F_Fahrt1 = 0;
        BL_ZB_OM_RMM_nZB = 0;
        Fstr_fe_Zug_eingefahren = 0;
        Stw_FSS_Sperrm_ein = 0;
        Fstr_fe_P2b = 0;
        Fstr_fe_Stoerung_F = 0;
        Fstr_fe_P2 = 0;
        Fstr_gf_aufgeloest = 1;
        Fstr_gf_G_Fahrt3 = 0;
        Fstr_gf_G_Halt = 1;
        Fstr_gf_Zug_eingefahren = 0;
        Fstr_gf_geprueft1 = 0;
        Fstr_gf_Stoerung_G = 0;
        Fstr_gf_verschlossen = 0;
        Fstr_fg_F_Fahrt3 = 0;
        Iso_egf_Zug_ausfahren = 0;
        Iso_cd_frei = 1;
        Iso_1_frei = 1;
        Iso_cd_belegt = 0;
        Iso_cd_Zug_einfahren = 0;
        Fstr_fg_geprueft0 = 0;
        Iso_cd_Zug_ausfahren = 0;
        Iso_gf_Zug_einfahren = 0;
        Iso_egf_Zug_einfahren = 0;
        Fstr_gf_P4 = 0;
        Lampen_1_G_VS_Stoer = 0;
        Iso_gf_Zug_ausfahren = 0;
        Fstr_fg_Stoerung_F = 0;
        Iso_gf_belegt = 0;
        Lampen_1_F_gruenFB1 = 0;
        Iso_gf_frei = 1;
        Lampen_1_BL_vZB_weiss = 0;
        Fstr_fg_aufgeloest = 1;
        Iso_1_Zug_einfahren = 0;
        Iso_egf_frei = 1;
        Fstr_fg_F_Halt = 1;
        Lampen_1_F_VS_Stoer = 0;
        Fstr_fg_P1 = 0;
        Fstr_fg_P2 = 0;
        Fstr_fg_Zug_eingefahren = 0;
        Fstr_fg_verschlossen = 0;
        Fstr_fg_geprueft1 = 0;
        Fstr_fg_geprueft2 = 0;
        Iso_egf_belegt = 0;
        Iso_1_Zug_ausfahren = 0;
        Iso_1_belegt = 0;
        Lampen_1_BL_vLN_rot = 0;
        Lampen_1_Fstr_ef = 0;
        Lampen_1_BL_nZB_rot = 0;
        Lampen_1_BL_nZB_weiss = 1;
        Lampen_1_BL_vZB_rot = 0;
        Lampen_1_BL_vLN_weiss = 0;
        Lampen_1_BL_nLN_rot = 0;
        Lampen_1_BL_nLN_weiss = 1;
        Lampen_1_Fstr_gf = 0;
        EMM_geprueft2A1 = 0;
        ext_Vb_Ueberw_W1_plus = 1;
        ext_Vb_G_VS_Lampe_Warn_def = 0;
        ext_Vb_F_VS_Lampe_Warn_def = 0;
        EMM_EMM_Grundstlg = 1;
        ext_Vb_G_VS_Lampe_Fahrt_def = 0;
        EMM_EMM_W10_pA1 = 0;
        ext_Vb_F_VS_Lampe_Fahrt_def = 0;
        EMM_OM_E_Fahrt = 0;
        EMM_geprueft1A2 = 0;
        EMM_geprueft2A2 = 0;
        EMM_EMM_W7_mA1 = 0;
        EMM_geprueft1A1 = 0;
        ext_Vb_Ueberw_W1_minus = 1;
        EMM_EMM_W10_pA2 = 0;
        EMM_EMM_W10_mA5 = 0;
        EMM_EMM_W10_mE4 = 0;
        EMM_D_FB1 = 0;
        EMM_geprueft1A4 = 0;
        EMM_EMM_W9_mA5 = 0;
        EMM_EMM_W8_mA5 = 0;
        EMM_geprueft1A5 = 0;
        EMM_EMM_W9_pA3 = 0;
        EMM_geprueft2A3 = 0;
        EMM_EMM_W9_mA4 = 0;
        EMM_EMM_W7_mE1 = 0;
        EMM_EMM_W9_mE5 = 0;
        EMM_EMM_W8_mE5 = 0;
        EMM_geprueft1A3 = 0;
        EMM_geprueft2A5 = 0;
        EMM_geprueft1E5 = 0;
        EMM_EMM_W8_pA4 = 0;
        EMM_EMM_W10_mA3 = 0;
        EMM_EMM_W10_pE1 = 0;
        EMM_EMM_W10_pE2 = 0;
        EMM_EMM_W7_pE2 = 0;
        EMM_EMM_W9_pE3 = 0;
        EMM_geprueft2A4 = 0;
        EMM_geprueft1E3 = 0;
        EMM_EMM_W7_pA2 = 0;
        EMM_geprueft1E4 = 0;
        EMM_EMM_W8_pE4 = 0;
        EMM_geprueft1E1 = 0;
        EMM_EMM_W9_mE4 = 0;
        EMM_EMM_W10_mA4 = 0;
        EMM_geprueft1E2 = 0;
        EMM_EMM_W10_mE3 = 0;
        EMM_C_FB2 = 0;
        LN_geprueft1A5 = 0;
        EMM_EMM_W10_mE5 = 0;
        EMM_C_Halt = 1;
        EMM_D_FB2 = 0;
        EMM_C_Fahrt = 0;
        EMM_C_FB1 = 0;
        EMM_D_Fahrt = 0;
        EMM_D_Halt = 1;
        LN_LN_W5_pA3 = 0;
        LN_LN_W1_pA5 = 0;
        LN_LN_W4_pA5 = 0;
        LN_LN_W2_pA2 = 0;
        LN_LN_W1_pE4 = 0;
        LN_geprueft1E5 = 0;
        LN_geprueft1E2 = 0;
        LN_EMM_Grundstlg = 0;
        LN_LN_W1_pA3 = 0;
        LN_LN_W1_mA1 = 0;
        LN_geprueft1E4 = 0;
        LN_geprueft2A4 = 0;
        LN_LN_W3_pA4 = 0;
        LN_LN_W3_mA5 = 0;
        LN_LN_W2_mA5 = 0;
        LN_geprueft2A5 = 0;
        LN_geprueft1A4 = 0;
        LN_geprueft1E3 = 0;
        LN_geprueft1A3 = 0;
        LN_LN_W1_pA4 = 0;
        LN_LN_W1_pA2 = 0;
        LN_geprueft2A3 = 0;
        LN_geprueft1A1 = 0;
        LN_LN_W3_pA3 = 0;
        LN_ce_belegt = 0;
        LN_geprueft2A2 = 0;
        LN_LN_W2_mA3 = 0;
        LN_geprueft2A1 = 0;
        LN_LN_W5_mA4 = 0;
        LN_LN_W2_mA4 = 0;
        LN_geprueft1A2 = 0;
        LN_geprueft1E1 = 0;
        LN_LN_W1_pA6 = 0;
        LN_geprueft2A6 = 0;
        LN_geprueft1A6 = 0;
        LN_LN_W3_mE5 = 0;
        LN_LN_W6_mA6 = 0;
        LN_LN_W6_mA5 = 0;
        LN_LN_W3_mA6 = 0;
        LN_LN_W4_pA6 = 0;
        LN_LN_W2_mA6 = 0;
        LN_E_FB1 = 0;
        LN_LN_W1_mE1 = 0;
        LN_C26_Fahrt = 0;
        ZB_C_Fahrt = 0;
        ZB_geprueft1A1 = 0;
        LN_LN_W1_pE2 = 0;
        LN_LN_W4_pE5 = 0;
        LN_geprueft1E6 = 0;
        LN_LN_W3_mE6 = 0;
        LN_LN_W3_pE3 = 0;
        LN_LN_W5_pE3 = 0;
        LN_LN_W1_pE5 = 0;
        LN_LN_W2_pE2 = 0;
        LN_LN_W1_pE3 = 0;
        LN_LN_W6_mE5 = 0;
        LN_LN_W2_mE5 = 0;
        LN_LN_W2_mE4 = 0;
        LN_LN_W3_pE4 = 0;
        LN_C1_Halt = 1;
        LN_C26_FB2 = 0;
        LN_C26_Halt = 1;
        LN_LN_W2_mE3 = 0;
        LN_E_FB2 = 0;
        LN_LN_W6_mE6 = 0;
        LN_LN_W2_mE6 = 0;
        LN_LN_W1_pE6 = 0;
        LN_LN_W5_mE4 = 0;
        LN_E_Fahrt = 0;
        LN_e_Halt = 1;
        LN_LN_W4_pE6 = 0;
        LN_C26_FB1 = 0;
        LN_C1_Fahrt2 = 0;
        ZB_geprueft1A2 = 0;
        ZB_cd_belegt = 0;
        ZB_D_Fahrt = 0;
        ZB_ZB_W2_pE2 = 0;
        ZB_geprueft1E2 = 0;
        ZB_EMM_Grundstlg = 0;
        ZB_ZB_W2_mE1 = 0;
        ZB_ZB_W2_mA1 = 0;
        ZB_ZB_W2_pA2 = 0;
        W1_keine_Endlage_plus = 0;
        W1_Endlage_plus = 1;
        W1_Endlage_minus = 0;
        W1_gestoert_p = 0;
        W1_gestoert_m = 0;
        Lampen_P34 = 1;
        Lampen_P12 = 0;
        Lampen_1_FBV_vLN = 0;
        Lampen_P13 = 0;
        Lampen_Iso_cd_aus = 1;
        Lampen_P33 = 1;
        Lampen_1_WS1_Ueberw = 0;
        Lampen_P48 = 0;
        Lampen_P4 = 1;
        Lampen_P6 = 1;
        Lampen_2_Signal = 0;
        Lampen_1_F_rot = 1;
        Lampen_P8 = 1;
        Lampen_P112 = 1;
        Lampen_P23 = 0;
        Lampen_P41 = 0;
        Lampen_P26 = 1;
        Lampen_1_FBV_vZB = 0;
        Lampen_P30 = 1;
        Lampen_P20 = 1;
        Lampen_P35 = 1;
        Lampen_P38 = 0;
        Lampen_P1 = 0;
        Lampen_P49 = 0;
        Lampen_2_Weiche = 0;
        Lampen_P32 = 1;
        Lampen_1_WS1_Freig = 0;
        Lampen_2_Block = 0;
        Lampen_1_Stoer_Wecker = 0;
        Lampen_P15 = 1;
        Lampen_P16 = 1;
        Lampen_P17 = 0;
        Lampen_P21 = 0;
        Lampen_Iso_cd_ein = 0;
        Lampen_P18 = 0;
        Lampen_P22 = 0;
        Lampen_P117 = 0;
        Lampen_P27 = 0;
        Lampen_P39 = 0;
        Lampen_P40 = 0;
        Lampen_P135 = 0;
        Kontakte_6_NT_W1 = 0;
        Kontakte_7_WS1_1 = 0;
        Kontakte_8_FSS_10EG = 0;
        Lampen_Iso_1_ein = 0;
        Kontakte_7_WS1_plus = 0;
        Lampen_Iso_ef_aus = 1;
        Kontakte_6_Gleist_EMM = 0;
        Kontakte_8_FSS_30EG = 0;
        Kontakte_6_FBF_nZB = 0;
        Kontakte_6_FBF_nLN = 0;
        Kontakte_8_FSS_45EG = 0;
        Lampen_Iso_1_aus = 1;
        Kontakte_6_FBA_nZB = 0;
        Kontakte_6_BLU_EG = 0;
        Lampen_Iso_egf_aus = 1;
        Kontakte_6_Gleist_ZB = 0;
        Lampen_Iso_ef_ein = 0;
        Kontakte_6_ISU_Sign = 0;
        Kontakte_6_NAL = 0;
        Kontakte_7_WS1_minus = 0;
        Kontakte_6_RM_nLN = 0;
        Kontakte_6_RM_nZB = 0;
        Lampen_Iso_egf_ein = 0;
        Kontakte_6_FBA_nLN = 0;
        Kontakte_8_FSS_90F = 0;
        Kontakte_8_FSS_30F = 0;
        Kontakte_8_FSS_10F = 0;
        Kontakte_8_FSS_90EG = 0;
        Kontakte_8_FSS_45F = 0;
        ILTIS_P130 = 0;
        ILTIS_RM_moeglich1 = 0;
        ILTIS_RM_LN_OM = 0;
        ILTIS_RM_moeglich2 = 0;
        ILTIS_rueckmelden_ZB_OM = 0;
        ILTIS_P230 = 0;
        ILTIS_RM_ZB_OM = 0;
        ZB_D_Halt = 1;
        ZB_geprueft2A2 = 0;
        ZB_C_Halt = 1;
        ZB_geprueft2A1 = 0;
        ZB_geprueft1E1 = 0;
        ZB_D_FB1 = 0;
        ZB_D_FB2 = 0;
        ILTIS_EMM_1_833 = 0;
        ILTIS_EMM_3_833 = 0;
        ILTIS_EMM_833_1 = 0;
        ZB_ZB_W1_pE2 = 0;
        ILTIS_EMM_2_833 = 0;
        ILTIS_EMM_4_833 = 0;
        ILTIS_EMM_5_833 = 0;
        ILTIS_ZB_2_138 = 0;
        ILTIS_EMM_833_5 = 0;
        ILTIS_ZB_138_1 = 0;
        ILTIS_ZB_138_2 = 0;
        ILTIS_LN_834_1 = 0;
        ILTIS_EMM_833_3 = 0;
        ILTIS_EMM_833_4 = 0;
        ZB_C_FB1 = 0;
        ILTIS_LN_834_3 = 0;
        ILTIS_EMM_833_2 = 0;
        ZB_ZB_W1_mA1 = 0;
        ILTIS_ZB_1_138 = 0;
        ILTIS_LN_834_4 = 0;
        ILTIS_LN_834_2 = 0;
        ZB_C_FB2 = 0;
        ZB_ZB_W1_mE1 = 0;
        ZB_ZB_W1_pA2 = 0;
        ILTIS_festhalten_vZB = 0;
        ILTIS_festgehalten_v_ZB = 0;
        ILTIS_LN_1_834 = 0;
        ILTIS_LN_834_5 = 0;
        ILTIS_LN_6_834 = 0;
        ILTIS_LN_4_834 = 0;
        ILTIS_LN_3_834 = 0;
        ILTIS_rueckmelden_LN_OM = 0;
        ILTIS_freigeben_vLN = 0;
        ILTIS_festhalten_vLN = 0;
        ILTIS_freigeben_vZB = 0;
        ILTIS_LN_2_834 = 0;
        ILTIS_festgehalten_vLN = 0;
        ILTIS_anfordern_vZB = 0;
        ILTIS_freigegeben_vZB = 1;
        ILTIS_LN_834_6 = 0;
        ILTIS_anfordern_vLN = 0;
        ILTIS_LN_5_834 = 0;
        ILTIS_freigegeben_vLN = 1;
        Kontakte_6_Anf_Durchf_nEMM = 0;
        Kontakte_6_Wecker_absch = 0;
        Kontakte_6_Wbel_ein = 0;
        Kontakte_6_Zeitsch_Umg = 0;
        Kontakte_8_FSS_0EGF = 0;
        Kontakte_8_FSS_1EGF = 0;
        Kontakte_8_FSS_80EG = 0;
        Kontakte_8_FSS_80F = 0;
        Kontakte_8_FSS_0EGF_1 = 0;
        ext_Vb_FBZ_vLN = 0;
        ext_Vb_RM_vLN = 0;
        ext_Vb_FBZ_vZB = 0;
        ext_Vb_RM_vZB = 0;
        ext_Vb_FBA_vEMM = 0;
        ext_Vb_vorblocken_vLN = 0;
        ext_Vb_abl_vEMM = 0;
        ext_Vb_abl_vLN = 0;
        ext_Vb_abl_vZB = 0;
        ext_Vb_abl_nEMM = 0;
        ext_Vb_abl_nLN = 0;
        ext_Vb_abl_nZB = 0;
        ext_Vb_Ueberw_def_aus = 0;
        ext_Vb_Stellstrom_def_aus = 0;
        ext_Vb_F_Lampe_rot_def = 0;
        ext_Vb_D_Lamt_def = 0;
        ext_Vb_G_Lampe_gruenFB3_def = 0;
        ext_Vb_E_Lampe_rot_def = 0;
        ext_Vb_G_Lampe_rot_def = 0;
        ext_Vb_F_Lampe_gruenFB3_def = 0;
        ext_Vb_E_Lampe_gruenFB1_def = 0;
        ext_Vb_blocken_vLN = 0;
        ext_Vb_blocken_vZB = 0;
        ext_Vb_vorblocken_vZB = 0;
    }
    public boolean fireOneTransition() {
        //check if W1_minus_erreichen can fire
        if ( (W1_Endlage_minus <= 0) &&
                (W1_keine_Endlage_plus >= 1) &&
                (W1_keine_Endlage_minus >= 1) &&
                (Kontakte_7_WS1_minus >= 1) &&
                (Kontakte_7_WS1_1 < 1))
        {
            if (canFire("W1_minus_erreichen"))
            {
                ++W1_Endlage_minus;
                --W1_keine_Endlage_plus;
                --W1_keine_Endlage_minus;
                fire("W1_minus_erreichen");
                return true;
            }
        }
        //check if W1_plus_erreichen can fire
        if ( (W1_Endlage_plus <= 0) &&
                (W1_keine_Endlage_minus >= 1) &&
                (W1_keine_Endlage_plus >= 1) &&
                (Kontakte_7_WS1_1 < 1) &&
                (Kontakte_7_WS1_plus >= 1))
        {
            if (canFire("W1_plus_erreichen"))
            {
                ++W1_Endlage_plus;
                --W1_keine_Endlage_minus;
                --W1_keine_Endlage_plus;
                fire("W1_plus_erreichen");
                return true;
            }
        }
        //check if W1_T3 can fire
        if ( (W1_Endlage_plus >= 1) &&
                (Kontakte_7_WS1_1 >= 1) &&
                (W1_keine_Endlage_plus <= 0))
        {
            if (canFire("W1_T3"))
            {
                --W1_Endlage_plus;
                ++W1_keine_Endlage_plus;
                fire("W1_T3");
                return true;
            }
        }
        //check if W1_T4 can fire
        if ( (W1_Endlage_minus >= 1) &&
                (Kontakte_7_WS1_1 >= 1) &&
                (W1_keine_Endlage_minus <= 0))
        {
            if (canFire("W1_T4"))
            {
                --W1_Endlage_minus;
                ++W1_keine_Endlage_minus;
                fire("W1_T4");
                return true;
            }
        }
        //check if W1_T6 can fire
        if ( (W1_Endlage_plus >= 1) &&
                (ext_Vb_Ueberw_W1_plus < 1) &&
                (W1_gestoert_p <= 0))
        {
            if (canFire("W1_T6"))
            {
                --W1_Endlage_plus;
                ++W1_gestoert_p;
                fire("W1_T6");
                return true;
            }
        }
        //check if W1_T7 can fire
        if ( (W1_Endlage_plus <= 0) &&
                (ext_Vb_Ueberw_W1_plus >= 1) &&
                (W1_gestoert_p >= 1))
        {
            if (canFire("W1_T7"))
            {
                ++W1_Endlage_plus;
                --W1_gestoert_p;
                fire("W1_T7");
                return true;
            }
        }
        //check if W1_T8 can fire
        if ( (W1_Endlage_minus >= 1) &&
                (ext_Vb_Ueberw_W1_minus < 1) &&
                (W1_gestoert_m <= 0))
        {
            if (canFire("W1_T8"))
            {
                --W1_Endlage_minus;
                ++W1_gestoert_m;
                fire("W1_T8");
                return true;
            }
        }
        //check if W1_T9 can fire
        if ( (W1_Endlage_minus <= 0) &&
                (ext_Vb_Ueberw_W1_minus >= 1) &&
                (W1_gestoert_m >= 1))
        {
            if (canFire("W1_T9"))
            {
                ++W1_Endlage_minus;
                --W1_gestoert_m;
                fire("W1_T9");
                return true;
            }
        }
        //check if Fstr_ef_pruefen1 can fire
        if ( (Fstr_ef_aufgeloest >= 1) &&
                (W1_Endlage_plus >= 1) &&
                (Fstr_ef_P6 <= 0) &&
                (Kontakte_8_FSS_30EG >= 1))
        {
            if (canFire("Fstr_ef_pruefen1"))
            {
                --Fstr_ef_aufgeloest;
                ++Fstr_ef_P6;
                fire("Fstr_ef_pruefen1");
                return true;
            }
        }
        //check if Fstr_ef_aufloesen can fire
        if ( (Fstr_ef_aufgeloest <= 0) &&
                (Fstr_ef_verschlossen >= 1) &&
                (Kontakte_8_FSS_30EG >= 1) &&
                (Fstr_ef_Zug_eingefahren >= 1))
        {
            if (canFire("Fstr_ef_aufloesen"))
            {
                ++Fstr_ef_aufgeloest;
                --Fstr_ef_verschlossen;
                --Fstr_ef_Zug_eingefahren;
                fire("Fstr_ef_aufloesen");
                return true;
            }
        }
        //check if Fstr_ef_Signal_stellen can fire
        if ( (Fstr_ef_verschlossen >= 1) &&
                (Fstr_ef_E_Fahrt1 <= 0) &&
                (Fstr_ef_E_Halt >= 1) &&
                (Kontakte_8_FSS_90EG >= 1))
        {
            if (canFire("Fstr_ef_Signal_stellen"))
            {
                ++Fstr_ef_E_Fahrt1;
                --Fstr_ef_E_Halt;
                fire("Fstr_ef_Signal_stellen");
                return true;
            }
        }
        //check if Fstr_ef_Signalstellen can fire
        if ( (Fstr_ef_P2 >= 1) &&
                (Fstr_ef_E_Fahrt1 >= 1) &&
                (Fstr_ef_E_Halt <= 1))
        {
            if (canFire("Fstr_ef_Signalstellen"))
            {
                --Fstr_ef_E_Fahrt1;
                ++Fstr_ef_E_Halt;
                fire("Fstr_ef_Signalstellen");
                return true;
            }
        }
        //check if Fstr_ef_ef_belegt can fire
        if ( (Fstr_ef_P1 <= 0) &&
                (Iso_ef_belegt >= 1))
        {
            if (canFire("Fstr_ef_ef_belegt"))
            {
                ++Fstr_ef_P1;
                fire("Fstr_ef_ef_belegt");
                return true;
            }
        }
        //check if Fstr_ef_1_belegt can fire
        if ( (Fstr_ef_P2 <= 0) &&
                (Iso_1_belegt >= 1) &&
                (Fstr_ef_P1 >= 1))
        {
            if (canFire("Fstr_ef_1_belegt"))
            {
                ++Fstr_ef_P2;
                --Fstr_ef_P1;
                fire("Fstr_ef_1_belegt");
                return true;
            }
        }
        //check if Fstr_ef_ef_frei can fire
        if ( (Fstr_ef_P2 >= 1) &&
                (Fstr_ef_Zug_eingefahren <= 0))
        {
            if (canFire("Fstr_ef_ef_frei"))
            {
                --Fstr_ef_P2;
                ++Fstr_ef_Zug_eingefahren;
                fire("Fstr_ef_ef_frei");
                return true;
            }
        }
        //check if Fstr_ef_verschliessen can fire
        if ( (Fstr_ef_verschlossen <= 0) &&
                (Fstr_ef_geprueft2 >= 1) &&
                (Kontakte_8_FSS_45EG >= 1))
        {
            if (canFire("Fstr_ef_verschliessen"))
            {
                ++Fstr_ef_verschlossen;
                --Fstr_ef_geprueft2;
                fire("Fstr_ef_verschliessen");
                return true;
            }
        }
        //check if Fstr_ef_Stoerung can fire
        if ( (Fstr_ef_Stoerung_E >= 1) &&
                (Fstr_ef_E_Fahrt1 >= 1) &&
                (Fstr_ef_E_Halt <= 1))
        {
            if (canFire("Fstr_ef_Stoerung"))
            {
                --Fstr_ef_E_Fahrt1;
                ++Fstr_ef_E_Halt;
                fire("Fstr_ef_Stoerung");
                return true;
            }
        }
        //check if Fstr_ef_T1 can fire
        if ( (Fstr_ef_geprueft2 <= 0) &&
                (Kontakte_6_BLU_EG >= 1) &&
                (Fstr_ef_geprueft1 >= 1))
        {
            if (canFire("Fstr_ef_T1"))
            {
                ++Fstr_ef_geprueft2;
                --Fstr_ef_geprueft1;
                fire("Fstr_ef_T1");
                return true;
            }
        }
        //check if Fstr_ef_T2 can fire
        if ( (Fstr_ef_geprueft2 <= 0) &&
                (Fstr_ef_geprueft1 >= 1) &&
                (BL_OM_LN_Grundstlg_n >= 1))
        {
            if (canFire("Fstr_ef_T2"))
            {
                ++Fstr_ef_geprueft2;
                --Fstr_ef_geprueft1;
                fire("Fstr_ef_T2");
                return true;
            }
        }
        //check if Fstr_ef_notaufloesen can fire
        if ( (Fstr_ef_verschlossen >= 1) &&
                (Kontakte_6_NAL >= 1) &&
                (Fstr_ef_aufgeloest <= 0))
        {
            if (canFire("Fstr_ef_notaufloesen"))
            {
                --Fstr_ef_verschlossen;
                ++Fstr_ef_aufgeloest;
                fire("Fstr_ef_notaufloesen");
                return true;
            }
        }
        //check if Fstr_ef_T6 can fire
        if ( (Fstr_ef_P6 >= 1) &&
                (Fstr_ef_geprueft1 <= 0) &&
                (Iso_1_frei >= 1) &&
                (Iso_egf_frei >= 1) &&
                (Iso_ef_frei >= 1))
        {
            if (canFire("Fstr_ef_T6"))
            {
                --Fstr_ef_P6;
                ++Fstr_ef_geprueft1;
                fire("Fstr_ef_T6");
                return true;
            }
        }
        //check if Fstr_ef_T7 can fire
        if ( (Fstr_ef_P6 >= 1) &&
                (Fstr_ef_geprueft1 <= 0) &&
                (Kontakte_6_ISU_Sign >= 1))
        {
            if (canFire("Fstr_ef_T7"))
            {
                --Fstr_ef_P6;
                ++Fstr_ef_geprueft1;
                fire("Fstr_ef_T7");
                return true;
            }
        }
        //check if Iso_ef_Einfahrt_Fz can fire
        if ( (Iso_ef_belegt <= 0) &&
                (Iso_ef_frei >= 1) &&
                (Iso_ef_Zug_einfahren >= 1))
        {
            if (canFire("Iso_ef_Einfahrt_Fz"))
            {
                ++Iso_ef_belegt;
                --Iso_ef_frei;
                --Iso_ef_Zug_einfahren;
                fire("Iso_ef_Einfahrt_Fz");
                return true;
            }
        }
        //check if Iso_ef_Ausfahrt_Fz can fire
        if ( (Iso_ef_belegt >= 1) &&
                (Iso_ef_Zug_ausfahren >= 1) &&
                (Iso_ef_frei <= 0))
        {
            if (canFire("Iso_ef_Ausfahrt_Fz"))
            {
                --Iso_ef_belegt;
                --Iso_ef_Zug_ausfahren;
                ++Iso_ef_frei;
                fire("Iso_ef_Ausfahrt_Fz");
                return true;
            }
        }
        //check if BL_OM_LN_Signal_Halt can fire
        if ( (BL_OM_LN_2 <= 0) &&
                (BL_OM_LN_1 >= 1) &&
                (Fstr_fg_F_Halt >= 1))
        {
            if (canFire("BL_OM_LN_Signal_Halt"))
            {
                ++BL_OM_LN_2;
                --BL_OM_LN_1;
                fire("BL_OM_LN_Signal_Halt");
                return true;
            }
        }
        //check if BL_OM_LN_rueckmelden_n can fire
        if ( (BL_OM_LN_Grundstlg_n <= 0) &&
                (BL_OM_LN_belegt_n >= 1) &&
                (ILTIS_RM_LN_OM >= 1))
        {
            if (canFire("BL_OM_LN_rueckmelden_n"))
            {
                ++BL_OM_LN_Grundstlg_n;
                --BL_OM_LN_belegt_n;
                fire("BL_OM_LN_rueckmelden_n");
                return true;
            }
        }
        //check if BL_OM_LN_Richtungs__wechsel_n can fire
        if ( (Kontakte_6_FBA_nLN >= 1) &&
                (BL_OM_LN_Grundstlg_n <= 0) &&
                (BL_OM_LN_Grundstlg_v >= 1) &&
                (ILTIS_festgehalten_vLN < 1))
        {
            if (canFire("BL_OM_LN_Richtungs__wechsel_n"))
            {
                ++BL_OM_LN_Grundstlg_n;
                --BL_OM_LN_Grundstlg_v;
                fire("BL_OM_LN_Richtungs__wechsel_n");
                return true;
            }
        }
        //check if BL_OM_LN_rueckmelden_von can fire
        if ( (BL_OM_LN_belegt_v >= 1) &&
                (BL_OM_LN_Grundstlg_v <= 0) &&
                (Kontakte_6_RM_nLN >= 1) &&
                (BL_OM_LN_RMM_nLN >= 1))
        {
            if (canFire("BL_OM_LN_rueckmelden_von"))
            {
                --BL_OM_LN_belegt_v;
                ++BL_OM_LN_Grundstlg_v;
                --BL_OM_LN_RMM_nLN;
                fire("BL_OM_LN_rueckmelden_von");
                return true;
            }
        }
        //check if BL_OM_LN_vormelden_von can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (BL_OM_LN_vorgebl_v <= 0) &&
                (LN_C26_Fahrt >= 1))
        {
            if (canFire("BL_OM_LN_vormelden_von"))
            {
                --BL_OM_LN_Grundstlg_v;
                ++BL_OM_LN_vorgebl_v;
                fire("BL_OM_LN_vormelden_von");
                return true;
            }
        }
        //check if BL_OM_LN_blocken_n_ef can fire
        if ( (BL_OM_LN_vorgebl_n >= 1) &&
                (BL_OM_LN_belegt_n <= 0) &&
                (Fstr_ef_E_Halt >= 1) &&
                (Iso_egf_belegt >= 1))
        {
            if (canFire("BL_OM_LN_blocken_n_ef"))
            {
                --BL_OM_LN_vorgebl_n;
                ++BL_OM_LN_belegt_n;
                fire("BL_OM_LN_blocken_n_ef");
                return true;
            }
        }
        //check if BL_OM_LN_blocken_von can fire
        if ( (BL_OM_LN_vorgebl_v >= 1) &&
                (LN_ce_belegt >= 1) &&
                (BL_OM_LN_belegt_v <= 0))
        {
            if (canFire("BL_OM_LN_blocken_von"))
            {
                --BL_OM_LN_vorgebl_v;
                ++BL_OM_LN_belegt_v;
                fire("BL_OM_LN_blocken_von");
                return true;
            }
        }
        //check if BL_OM_LN_Richtungs__wechsel_v can fire
        if ( (BL_OM_LN_Grundstlg_n >= 1) &&
                (BL_OM_LN_Grundstlg_v <= 0) &&
                (Kontakte_6_FBF_nLN < 1) &&
                (ILTIS_anfordern_vLN >= 1))
        {
            if (canFire("BL_OM_LN_Richtungs__wechsel_v"))
            {
                --BL_OM_LN_Grundstlg_n;
                ++BL_OM_LN_Grundstlg_v;
                fire("BL_OM_LN_Richtungs__wechsel_v");
                return true;
            }
        }
        //check if BL_OM_LN_Fahrt3_pruefen can fire
        if ( (BL_OM_LN_1 <= 0) &&
                (Fstr_fg_F_Fahrt3 >= 1))
        {
            if (canFire("BL_OM_LN_Fahrt3_pruefen"))
            {
                ++BL_OM_LN_1;
                fire("BL_OM_LN_Fahrt3_pruefen");
                return true;
            }
        }
        //check if BL_OM_LN_vormelden_n_ef can fire
        if ( (BL_OM_LN_Grundstlg_n >= 1) &&
                (BL_OM_LN_vorgebl_n <= 0) &&
                (Fstr_ef_verschlossen >= 1))
        {
            if (canFire("BL_OM_LN_vormelden_n_ef"))
            {
                --BL_OM_LN_Grundstlg_n;
                ++BL_OM_LN_vorgebl_n;
                fire("BL_OM_LN_vormelden_n_ef");
                return true;
            }
        }
        //check if BL_OM_LN_1_belegt can fire
        if ( (BL_OM_LN_2 >= 1) &&
                (Iso_1_belegt >= 1) &&
                (BL_OM_LN_3 <= 0))
        {
            if (canFire("BL_OM_LN_1_belegt"))
            {
                --BL_OM_LN_2;
                ++BL_OM_LN_3;
                fire("BL_OM_LN_1_belegt");
                return true;
            }
        }
        //check if BL_OM_LN_1_frei can fire
        if ( (BL_OM_LN_3 >= 1) &&
                (BL_OM_LN_RMM_nLN <= 0) &&
                (Iso_1_frei >= 1))
        {
            if (canFire("BL_OM_LN_1_frei"))
            {
                --BL_OM_LN_3;
                ++BL_OM_LN_RMM_nLN;
                fire("BL_OM_LN_1_frei");
                return true;
            }
        }
        //check if BL_OM_LN_Fahrt1_pruefen can fire
        if ( (BL_OM_LN_1 <= 0) &&
                (Fstr_fe_F_Fahrt1 >= 1))
        {
            if (canFire("BL_OM_LN_Fahrt1_pruefen"))
            {
                ++BL_OM_LN_1;
                fire("BL_OM_LN_Fahrt1_pruefen");
                return true;
            }
        }
        //check if BL_OM_LN_T2 can fire
        if ( (BL_OM_LN_1 >= 1) &&
                (BL_OM_LN_2 <= 0) &&
                (Fstr_fe_F_Halt >= 1))
        {
            if (canFire("BL_OM_LN_T2"))
            {
                --BL_OM_LN_1;
                ++BL_OM_LN_2;
                fire("BL_OM_LN_T2");
                return true;
            }
        }
        //check if BL_OM_LN_vormelden_n_gf can fire
        if ( (BL_OM_LN_Grundstlg_n >= 1) &&
                (BL_OM_LN_vorgebl_n <= 0) &&
                (Fstr_gf_verschlossen >= 1))
        {
            if (canFire("BL_OM_LN_vormelden_n_gf"))
            {
                --BL_OM_LN_Grundstlg_n;
                ++BL_OM_LN_vorgebl_n;
                fire("BL_OM_LN_vormelden_n_gf");
                return true;
            }
        }
        //check if BL_OM_LN_blocken_n_gf can fire
        if ( (BL_OM_LN_vorgebl_n >= 1) &&
                (BL_OM_LN_belegt_n <= 0) &&
                (Iso_egf_belegt >= 1) &&
                (Fstr_gf_G_Halt >= 1))
        {
            if (canFire("BL_OM_LN_blocken_n_gf"))
            {
                --BL_OM_LN_vorgebl_n;
                ++BL_OM_LN_belegt_n;
                fire("BL_OM_LN_blocken_n_gf");
                return true;
            }
        }
        //check if BL_OM_LN_T1 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (BL_OM_LN_vorgebl_v <= 0) &&
                (LN_C1_Fahrt2 >= 1))
        {
            if (canFire("BL_OM_LN_T1"))
            {
                --BL_OM_LN_Grundstlg_v;
                ++BL_OM_LN_vorgebl_v;
                fire("BL_OM_LN_T1");
                return true;
            }
        }
        //check if BL_ZB_OM_Richtungs__wechsel_v can fire
        if ( (BL_ZB_OM_Grundstlg_v <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1) &&
                (Kontakte_6_FBF_nZB < 1) &&
                (ILTIS_anfordern_vZB >= 1))
        {
            if (canFire("BL_ZB_OM_Richtungs__wechsel_v"))
            {
                ++BL_ZB_OM_Grundstlg_v;
                --BL_ZB_OM_Grundstlg_n;
                fire("BL_ZB_OM_Richtungs__wechsel_v");
                return true;
            }
        }
        //check if BL_ZB_OM_vormelden_n can fire
        if ( (BL_ZB_OM_vorgebl_n <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1) &&
                (Fstr_fg_verschlossen >= 1))
        {
            if (canFire("BL_ZB_OM_vormelden_n"))
            {
                ++BL_ZB_OM_vorgebl_n;
                --BL_ZB_OM_Grundstlg_n;
                fire("BL_ZB_OM_vormelden_n");
                return true;
            }
        }
        //check if BL_ZB_OM_rueckmelden_n can fire
        if ( (BL_ZB_OM_belegt_n >= 1) &&
                (BL_ZB_OM_Grundstlg_n <= 0) &&
                (ILTIS_RM_ZB_OM >= 1))
        {
            if (canFire("BL_ZB_OM_rueckmelden_n"))
            {
                --BL_ZB_OM_belegt_n;
                ++BL_ZB_OM_Grundstlg_n;
                fire("BL_ZB_OM_rueckmelden_n");
                return true;
            }
        }
        //check if BL_ZB_OM_rueckmelden_von can fire
        if ( (BL_ZB_OM_belegt_v >= 1) &&
                (BL_ZB_OM_RMM_nZB >= 1) &&
                (BL_ZB_OM_Grundstlg_v <= 0) &&
                (Kontakte_6_RM_nZB >= 1))
        {
            if (canFire("BL_ZB_OM_rueckmelden_von"))
            {
                --BL_ZB_OM_belegt_v;
                --BL_ZB_OM_RMM_nZB;
                ++BL_ZB_OM_Grundstlg_v;
                fire("BL_ZB_OM_rueckmelden_von");
                return true;
            }
        }
        //check if BL_ZB_OM_vormelden_v can fire
        if ( (BL_ZB_OM_vorgebl_v <= 0) &&
                (BL_ZB_OM_Grundstlg_v >= 1) &&
                (ZB_C_Fahrt >= 1))
        {
            if (canFire("BL_ZB_OM_vormelden_v"))
            {
                ++BL_ZB_OM_vorgebl_v;
                --BL_ZB_OM_Grundstlg_v;
                fire("BL_ZB_OM_vormelden_v");
                return true;
            }
        }
        //check if BL_ZB_OM_blocken_N can fire
        if ( (BL_ZB_OM_belegt_n <= 0) &&
                (BL_ZB_OM_vorgebl_n >= 1) &&
                (Iso_1_belegt >= 1))
        {
            if (canFire("BL_ZB_OM_blocken_N"))
            {
                ++BL_ZB_OM_belegt_n;
                --BL_ZB_OM_vorgebl_n;
                fire("BL_ZB_OM_blocken_N");
                return true;
            }
        }
        //check if BL_ZB_OM_blocken_v can fire
        if ( (ZB_cd_belegt >= 1) &&
                (BL_ZB_OM_belegt_v <= 0) &&
                (BL_ZB_OM_vorgebl_v >= 1))
        {
            if (canFire("BL_ZB_OM_blocken_v"))
            {
                ++BL_ZB_OM_belegt_v;
                --BL_ZB_OM_vorgebl_v;
                fire("BL_ZB_OM_blocken_v");
                return true;
            }
        }
        //check if BL_ZB_OM_Richtungs__wechsel_n can fire
        if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
                (Kontakte_6_FBA_nZB >= 1) &&
                (BL_ZB_OM_Grundstlg_n <= 0) &&
                (ILTIS_festgehalten_v_ZB < 1))
        {
            if (canFire("BL_ZB_OM_Richtungs__wechsel_n"))
            {
                --BL_ZB_OM_Grundstlg_v;
                ++BL_ZB_OM_Grundstlg_n;
                fire("BL_ZB_OM_Richtungs__wechsel_n");
                return true;
            }
        }
        //check if BL_ZB_OM_G_Halt can fire
        if ( (BL_ZB_OM_1 >= 1) &&
                (BL_ZB_OM_2 <= 0) &&
                (Fstr_gf_G_Halt >= 1))
        {
            if (canFire("BL_ZB_OM_G_Halt"))
            {
                --BL_ZB_OM_1;
                ++BL_ZB_OM_2;
                fire("BL_ZB_OM_G_Halt");
                return true;
            }
        }
        //check if BL_ZB_OM_G_Fahrt can fire
        if ( (Fstr_gf_G_Fahrt3 >= 1) &&
                (BL_ZB_OM_1 <= 0))
        {
            if (canFire("BL_ZB_OM_G_Fahrt"))
            {
                ++BL_ZB_OM_1;
                fire("BL_ZB_OM_G_Fahrt");
                return true;
            }
        }
        //check if BL_ZB_OM_1_belegt can fire
        if ( (Iso_1_belegt >= 1) &&
                (BL_ZB_OM_2 >= 1) &&
                (BL_ZB_OM_3 <= 0))
        {
            if (canFire("BL_ZB_OM_1_belegt"))
            {
                --BL_ZB_OM_2;
                ++BL_ZB_OM_3;
                fire("BL_ZB_OM_1_belegt");
                return true;
            }
        }
        //check if BL_ZB_OM_1_frei can fire
        if ( (BL_ZB_OM_RMM_nZB <= 0) &&
                (Iso_1_frei >= 1) &&
                (BL_ZB_OM_3 >= 1))
        {
            if (canFire("BL_ZB_OM_1_frei"))
            {
                ++BL_ZB_OM_RMM_nZB;
                --BL_ZB_OM_3;
                fire("BL_ZB_OM_1_frei");
                return true;
            }
        }
        //check if Stw_SM_abfallen can fire
        if ( (Stw_FSS_Sperrm_ein >= 1) &&
                (Stw_FSS_Sperrm_aus <= 0) &&
                (Kontakte_8_FSS_10F >= 1) &&
                (Stw_P10 >= 1))
        {
            if (canFire("Stw_SM_abfallen"))
            {
                --Stw_FSS_Sperrm_ein;
                ++Stw_FSS_Sperrm_aus;
                --Stw_P10;
                fire("Stw_SM_abfallen");
                return true;
            }
        }
        //check if Stw_KS_anziehen can fire
        if ( (Fstr_ef_geprueft2 >= 1) &&
                (Stw_FSS_Kuppelm_aus >= 1) &&
                (Stw_FSS_Kuppelm_ein <= 0))
        {
            if (canFire("Stw_KS_anziehen"))
            {
                --Stw_FSS_Kuppelm_aus;
                ++Stw_FSS_Kuppelm_ein;
                fire("Stw_KS_anziehen");
                return true;
            }
        }
        //check if Stw_KS_abfallen can fire
        if ( (Fstr_ef_Zug_eingefahren >= 1) &&
                (Stw_FSS_Kuppelm_aus <= 0) &&
                (Stw_FSS_Kuppelm_ein >= 1))
        {
            if (canFire("Stw_KS_abfallen"))
            {
                ++Stw_FSS_Kuppelm_aus;
                --Stw_FSS_Kuppelm_ein;
                fire("Stw_KS_abfallen");
                return true;
            }
        }
        //check if Stw_WSM_abfallen can fire
        if ( (Stw_WS_Sperrm_ein >= 1) &&
                (Kontakte_7_WS1_1 < 1) &&
                (Stw_WS_Sperrm_aus <= 0))
        {
            if (canFire("Stw_WSM_abfallen"))
            {
                --Stw_WS_Sperrm_ein;
                ++Stw_WS_Sperrm_aus;
                fire("Stw_WSM_abfallen");
                return true;
            }
        }
        //check if Stw_SM_anziehen can fire
        if ( (Kontakte_6_Gleist_EMM >= 1) &&
                (Kontakte_8_FSS_10F >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_7_WS1_plus >= 1) &&
                (Stw_FSS_Sperrm_aus >= 1))
        {
            if (canFire("Stw_SM_anziehen"))
            {
                ++Stw_FSS_Sperrm_ein;
                --Stw_FSS_Sperrm_aus;
                fire("Stw_SM_anziehen");
                return true;
            }
        }
        //check if Stw_T25 can fire
        if ( (Stw_FSS_Sperrm_ein >= 1) &&
                (Stw_FSS_Sperrm_aus <= 0) &&
                (Kontakte_8_FSS_10EG >= 1) &&
                (Stw_P11 >= 1))
        {
            if (canFire("Stw_T25"))
            {
                --Stw_FSS_Sperrm_ein;
                ++Stw_FSS_Sperrm_aus;
                --Stw_P11;
                fire("Stw_T25");
                return true;
            }
        }
        //check if Stw_T23 can fire
        if ( (Fstr_fe_Zug_eingefahren >= 1) &&
                (Stw_FSS_Kuppelm_aus <= 0) &&
                (Stw_FSS_Kuppelm_ein >= 1))
        {
            if (canFire("Stw_T23"))
            {
                ++Stw_FSS_Kuppelm_aus;
                --Stw_FSS_Kuppelm_ein;
                fire("Stw_T23");
                return true;
            }
        }
        //check if Stw_T11 can fire
        if ( (Kontakte_8_FSS_10EG >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_6_Gleist_ZB >= 1) &&
                (Kontakte_7_WS1_minus >= 1) &&
                (Stw_FSS_Sperrm_aus >= 1))
        {
            if (canFire("Stw_T11"))
            {
                ++Stw_FSS_Sperrm_ein;
                --Stw_FSS_Sperrm_aus;
                fire("Stw_T11");
                return true;
            }
        }
        //check if Stw_T13 can fire
        if ( (Stw_FSS_Sperrm_aus >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_8_FSS_45EG >= 1))
        {
            if (canFire("Stw_T13"))
            {
                --Stw_FSS_Sperrm_aus;
                ++Stw_FSS_Sperrm_ein;
                fire("Stw_T13");
                return true;
            }
        }
        //check if Stw_T14 can fire
        if ( (Stw_FSS_Sperrm_aus >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_8_FSS_45F >= 1))
        {
            if (canFire("Stw_T14"))
            {
                --Stw_FSS_Sperrm_aus;
                ++Stw_FSS_Sperrm_ein;
                fire("Stw_T14");
                return true;
            }
        }
        //check if Stw_T22 can fire
        if ( (Kontakte_6_NT_W1 >= 1) &&
                (Stw_WS_Sperrm_aus >= 1) &&
                (Kontakte_7_WS1_1 >= 1) &&
                (Stw_WS_Sperrm_ein <= 0))
        {
            if (canFire("Stw_T22"))
            {
                --Stw_WS_Sperrm_aus;
                ++Stw_WS_Sperrm_ein;
                fire("Stw_T22");
                return true;
            }
        }
        //check if Stw_WSM_anziehen can fire
        if ( (Kontakte_7_WS1_1 >= 1) &&
                (Fstr_fg_aufgeloest >= 1) &&
                (Fstr_gf_aufgeloest >= 1) &&
                (Stw_WS_Sperrm_aus >= 1) &&
                (Iso_1_frei >= 1) &&
                (Fstr_ef_aufgeloest >= 1) &&
                (Fstr_fe_aufgeloest >= 1) &&
                (Stw_WS_Sperrm_ein <= 0))
        {
            if (canFire("Stw_WSM_anziehen"))
            {
                --Stw_WS_Sperrm_aus;
                ++Stw_WS_Sperrm_ein;
                fire("Stw_WSM_anziehen");
                return true;
            }
        }
        //check if Stw_T5 can fire
        if ( (Stw_FSS_Kuppelm_aus >= 1) &&
                (Fstr_fe_geprueft >= 1) &&
                (Stw_FSS_Kuppelm_ein <= 0))
        {
            if (canFire("Stw_T5"))
            {
                --Stw_FSS_Kuppelm_aus;
                ++Stw_FSS_Kuppelm_ein;
                fire("Stw_T5");
                return true;
            }
        }
        //check if Stw_T6 can fire
        if ( (Fstr_fg_geprueft2 >= 1) &&
                (Stw_FSS_Kuppelm_aus >= 1) &&
                (Stw_FSS_Kuppelm_ein <= 0))
        {
            if (canFire("Stw_T6"))
            {
                --Stw_FSS_Kuppelm_aus;
                ++Stw_FSS_Kuppelm_ein;
                fire("Stw_T6");
                return true;
            }
        }
        //check if Stw_T7 can fire
        if ( (Stw_FSS_Kuppelm_aus >= 1) &&
                (Fstr_gf_geprueft2 >= 1) &&
                (Stw_FSS_Kuppelm_ein <= 0))
        {
            if (canFire("Stw_T7"))
            {
                --Stw_FSS_Kuppelm_aus;
                ++Stw_FSS_Kuppelm_ein;
                fire("Stw_T7");
                return true;
            }
        }
        //check if Stw_T24 can fire
        if ( (Fstr_fg_Zug_eingefahren >= 1) &&
                (Stw_FSS_Kuppelm_aus <= 0) &&
                (Stw_FSS_Kuppelm_ein >= 1))
        {
            if (canFire("Stw_T24"))
            {
                ++Stw_FSS_Kuppelm_aus;
                --Stw_FSS_Kuppelm_ein;
                fire("Stw_T24");
                return true;
            }
        }
        //check if Stw_T9 can fire
        if ( (Fstr_gf_Zug_eingefahren >= 1) &&
                (Stw_FSS_Kuppelm_aus <= 0) &&
                (Stw_FSS_Kuppelm_ein >= 1))
        {
            if (canFire("Stw_T9"))
            {
                ++Stw_FSS_Kuppelm_aus;
                --Stw_FSS_Kuppelm_ein;
                fire("Stw_T9");
                return true;
            }
        }
        //check if Stw_T21 can fire
        if ( (Stw_FSS_Sperrm_aus >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_8_FSS_10F >= 1) &&
                (Kontakte_7_WS1_minus >= 1) &&
                (Kontakte_6_Gleist_ZB >= 1))
        {
            if (canFire("Stw_T21"))
            {
                --Stw_FSS_Sperrm_aus;
                ++Stw_FSS_Sperrm_ein;
                fire("Stw_T21");
                return true;
            }
        }
        //check if Stw_T26 can fire
        if ( (Stw_FSS_Sperrm_aus >= 1) &&
                (Stw_FSS_Sperrm_ein <= 0) &&
                (Kontakte_8_FSS_10EG >= 1) &&
                (Kontakte_7_WS1_plus >= 1) &&
                (Kontakte_6_Gleist_EMM >= 1))
        {
            if (canFire("Stw_T26"))
            {
                --Stw_FSS_Sperrm_aus;
                ++Stw_FSS_Sperrm_ein;
                fire("Stw_T26");
                return true;
            }
        }
        //check if Stw_T3 can fire
        if ( (Kontakte_8_FSS_45F >= 1) &&
                (Stw_P10 <= 0))
        {
            if (canFire("Stw_T3"))
            {
                ++Stw_P10;
                fire("Stw_T3");
                return true;
            }
        }
        //check if Stw_T4 can fire
        if ( (Kontakte_8_FSS_45EG >= 1) &&
                (Stw_P11 <= 0))
        {
            if (canFire("Stw_T4"))
            {
                ++Stw_P11;
                fire("Stw_T4");
                return true;
            }
        }
        //check if Fstr_fe_aufloesen can fire
        if ( (Fstr_fe_verschlossen >= 1) &&
                (Fstr_fe_aufgeloest <= 1) &&
                (Fstr_fe_Zug_eingefahren >= 1))
        {
            if (canFire("Fstr_fe_aufloesen"))
            {
                --Fstr_fe_verschlossen;
                ++Fstr_fe_aufgeloest;
                --Fstr_fe_Zug_eingefahren;
                fire("Fstr_fe_aufloesen");
                return true;
            }
        }
        //check if Fstr_fe_egf_frei can fire
        if ( (Fstr_fe_P2b >= 1) &&
                (Fstr_fe_Zug_eingefahren <= 0))
        {
            if (canFire("Fstr_fe_egf_frei"))
            {
                --Fstr_fe_P2b;
                ++Fstr_fe_Zug_eingefahren;
                fire("Fstr_fe_egf_frei");
                return true;
            }
        }
        //check if Fstr_fe_1_belegt can fire
        if ( (Fstr_fe_P1 >= 1) &&
                (Fstr_fe_P2b <= 0) &&
                (Iso_1_belegt >= 1))
        {
            if (canFire("Fstr_fe_1_belegt"))
            {
                --Fstr_fe_P1;
                ++Fstr_fe_P2b;
                fire("Fstr_fe_1_belegt");
                return true;
            }
        }
        //check if Fstr_fe_egf_belegt can fire
        if ( (Iso_egf_belegt >= 1) &&
                (Fstr_fe_P1 <= 0))
        {
            if (canFire("Fstr_fe_egf_belegt"))
            {
                ++Fstr_fe_P1;
                fire("Fstr_fe_egf_belegt");
                return true;
            }
        }
        //check if Fstr_fe_Signal_haltstellen can fire
        if ( (Fstr_fe_F_Fahrt1 >= 1) &&
                (Fstr_fe_F_Halt <= 1) &&
                (Fstr_fe_P2b >= 1))
        {
            if (canFire("Fstr_fe_Signal_haltstellen"))
            {
                --Fstr_fe_F_Fahrt1;
                ++Fstr_fe_F_Halt;
                fire("Fstr_fe_Signal_haltstellen");
                return true;
            }
        }
        //check if Fstr_fe_Signal_fahrtstellen can fire
        if ( (Fstr_fe_verschlossen >= 1) &&
                (Fstr_fe_F_Halt >= 1) &&
                (Fstr_fe_F_Fahrt1 <= 0) &&
                (Kontakte_8_FSS_90F >= 1))
        {
            if (canFire("Fstr_fe_Signal_fahrtstellen"))
            {
                --Fstr_fe_F_Halt;
                ++Fstr_fe_F_Fahrt1;
                fire("Fstr_fe_Signal_fahrtstellen");
                return true;
            }
        }
        //check if Fstr_fe_verschliessen can fire
        if ( (Fstr_fe_geprueft >= 1) &&
                (Fstr_fe_verschlossen <= 0) &&
                (Kontakte_8_FSS_45F >= 1))
        {
            if (canFire("Fstr_fe_verschliessen"))
            {
                --Fstr_fe_geprueft;
                ++Fstr_fe_verschlossen;
                fire("Fstr_fe_verschliessen");
                return true;
            }
        }
        //check if Fstr_fe_pruefen can fire
        if ( (Fstr_fe_aufgeloest >= 1) &&
                (W1_Endlage_plus >= 1) &&
                (Fstr_fe_P2 <= 0) &&
                (Kontakte_8_FSS_30F >= 1))
        {
            if (canFire("Fstr_fe_pruefen"))
            {
                --Fstr_fe_aufgeloest;
                ++Fstr_fe_P2;
                fire("Fstr_fe_pruefen");
                return true;
            }
        }
        //check if Fstr_fe_Stoerung can fire
        if ( (Fstr_fe_F_Fahrt1 >= 1) &&
                (Fstr_fe_F_Halt <= 1) &&
                (Fstr_fe_Stoerung_F >= 1))
        {
            if (canFire("Fstr_fe_Stoerung"))
            {
                --Fstr_fe_F_Fahrt1;
                ++Fstr_fe_F_Halt;
                fire("Fstr_fe_Stoerung");
                return true;
            }
        }
        //check if Fstr_fe_notaufloesen can fire
        if ( (Fstr_fe_verschlossen >= 1) &&
                (Fstr_fe_aufgeloest <= 1) &&
                (Kontakte_6_NAL >= 1))
        {
            if (canFire("Fstr_fe_notaufloesen"))
            {
                --Fstr_fe_verschlossen;
                ++Fstr_fe_aufgeloest;
                fire("Fstr_fe_notaufloesen");
                return true;
            }
        }
        //check if Fstr_fe_T2 can fire
        if ( (Fstr_fe_P2 >= 1) &&
                (Iso_ef_frei >= 1) &&
                (Iso_egf_frei >= 1) &&
                (Iso_1_frei >= 1) &&
                (Iso_cd_frei >= 1) &&
                (Fstr_fe_geprueft <= 0))
        {
            if (canFire("Fstr_fe_T2"))
            {
                --Fstr_fe_P2;
                ++Fstr_fe_geprueft;
                fire("Fstr_fe_T2");
                return true;
            }
        }
        //check if Fstr_fe_T3 can fire
        if ( (Fstr_fe_P2 >= 1) &&
                (Fstr_fe_geprueft <= 0) &&
                (Kontakte_6_ISU_Sign >= 1))
        {
            if (canFire("Fstr_fe_T3"))
            {
                --Fstr_fe_P2;
                ++Fstr_fe_geprueft;
                fire("Fstr_fe_T3");
                return true;
            }
        }
        //check if Fstr_gf_aufloesen can fire
        if ( (Fstr_gf_aufgeloest <= 0) &&
                (Fstr_gf_verschlossen >= 1) &&
                (Fstr_gf_Zug_eingefahren >= 1))
        {
            if (canFire("Fstr_gf_aufloesen"))
            {
                ++Fstr_gf_aufgeloest;
                --Fstr_gf_verschlossen;
                --Fstr_gf_Zug_eingefahren;
                fire("Fstr_gf_aufloesen");
                return true;
            }
        }
        //check if Fstr_gf_1_belegt can fire
        if ( (Iso_1_belegt >= 1) &&
                (Fstr_gf_Zug_eingefahren <= 0))
        {
            if (canFire("Fstr_gf_1_belegt"))
            {
                ++Fstr_gf_Zug_eingefahren;
                fire("Fstr_gf_1_belegt");
                return true;
            }
        }
        //check if Fstr_gf_Signal_haltstellen can fire
        if ( (Fstr_gf_Zug_eingefahren >= 1) &&
                (Fstr_gf_G_Fahrt3 >= 1) &&
                (Fstr_gf_G_Halt <= 1))
        {
            if (canFire("Fstr_gf_Signal_haltstellen"))
            {
                --Fstr_gf_G_Fahrt3;
                ++Fstr_gf_G_Halt;
                fire("Fstr_gf_Signal_haltstellen");
                return true;
            }
        }
        //check if Fstr_gf_Signal_fahrtstellen can fire
        if ( (Fstr_gf_verschlossen >= 1) &&
                (Fstr_gf_G_Fahrt3 <= 0) &&
                (Fstr_gf_G_Halt >= 1) &&
                (Kontakte_8_FSS_90EG >= 1))
        {
            if (canFire("Fstr_gf_Signal_fahrtstellen"))
            {
                ++Fstr_gf_G_Fahrt3;
                --Fstr_gf_G_Halt;
                fire("Fstr_gf_Signal_fahrtstellen");
                return true;
            }
        }
        //check if Fstr_gf_verschliessen can fire
        if ( (Fstr_gf_geprueft2 >= 1) &&
                (Fstr_gf_verschlossen <= 0) &&
                (Kontakte_8_FSS_45EG >= 1))
        {
            if (canFire("Fstr_gf_verschliessen"))
            {
                --Fstr_gf_geprueft2;
                ++Fstr_gf_verschlossen;
                fire("Fstr_gf_verschliessen");
                return true;
            }
        }
        //check if Fstr_gf_prüfen1 can fire
        if ( (Fstr_gf_aufgeloest >= 1) &&
                (Fstr_gf_P4 <= 0) &&
                (W1_Endlage_minus >= 1) &&
                (Kontakte_8_FSS_30EG >= 1))
        {
            if (canFire("Fstr_gf_prüfen1"))
            {
                --Fstr_gf_aufgeloest;
                ++Fstr_gf_P4;
                fire("Fstr_gf_prüfen1");
                return true;
            }
        }
        //check if Fstr_gf_Stoerung can fire
        if ( (Fstr_gf_Stoerung_G >= 1) &&
                (Fstr_gf_G_Fahrt3 >= 1) &&
                (Fstr_gf_G_Halt <= 1))
        {
            if (canFire("Fstr_gf_Stoerung"))
            {
                --Fstr_gf_G_Fahrt3;
                ++Fstr_gf_G_Halt;
                fire("Fstr_gf_Stoerung");
                return true;
            }
        }
        //check if Fstr_gf_T1 can fire
        if ( (Fstr_gf_geprueft1 >= 1) &&
                (Fstr_gf_geprueft2 <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1))
        {
            if (canFire("Fstr_gf_T1"))
            {
                --Fstr_gf_geprueft1;
                ++Fstr_gf_geprueft2;
                fire("Fstr_gf_T1");
                return true;
            }
        }
        //check if Fstr_gf_T2 can fire
        if ( (Fstr_gf_geprueft1 >= 1) &&
                (Fstr_gf_geprueft2 <= 0) &&
                (Kontakte_6_BLU_EG >= 1))
        {
            if (canFire("Fstr_gf_T2"))
            {
                --Fstr_gf_geprueft1;
                ++Fstr_gf_geprueft2;
                fire("Fstr_gf_T2");
                return true;
            }
        }
        //check if Fstr_gf_notaufloesen can fire
        if ( (Fstr_gf_aufgeloest <= 0) &&
                (Fstr_gf_verschlossen >= 1) &&
                (Kontakte_6_NAL >= 1))
        {
            if (canFire("Fstr_gf_notaufloesen"))
            {
                ++Fstr_gf_aufgeloest;
                --Fstr_gf_verschlossen;
                fire("Fstr_gf_notaufloesen");
                return true;
            }
        }
        //check if Fstr_gf_T5 can fire
        if ( (Fstr_gf_P4 >= 1) &&
                (Fstr_gf_geprueft1 <= 0) &&
                (Iso_egf_frei >= 1) &&
                (Iso_1_frei >= 1))
        {
            if (canFire("Fstr_gf_T5"))
            {
                --Fstr_gf_P4;
                ++Fstr_gf_geprueft1;
                fire("Fstr_gf_T5");
                return true;
            }
        }
        //check if Fstr_gf_T6 can fire
        if ( (Fstr_gf_P4 >= 1) &&
                (Fstr_gf_geprueft1 <= 0) &&
                (Kontakte_6_ISU_Sign >= 1))
        {
            if (canFire("Fstr_gf_T6"))
            {
                --Fstr_gf_P4;
                ++Fstr_gf_geprueft1;
                fire("Fstr_gf_T6");
                return true;
            }
        }
        //check if Fstr_fg_aufloesen can fire
        if ( (Fstr_fg_aufgeloest <= 0) &&
                (Fstr_fg_verschlossen >= 1) &&
                (Fstr_fg_Zug_eingefahren >= 1))
        {
            if (canFire("Fstr_fg_aufloesen"))
            {
                ++Fstr_fg_aufgeloest;
                --Fstr_fg_verschlossen;
                --Fstr_fg_Zug_eingefahren;
                fire("Fstr_fg_aufloesen");
                return true;
            }
        }
        //check if Fstr_fg_egf_frei can fire
        if ( (Fstr_fg_P2 >= 1) &&
                (Fstr_fg_Zug_eingefahren <= 0))
        {
            if (canFire("Fstr_fg_egf_frei"))
            {
                --Fstr_fg_P2;
                ++Fstr_fg_Zug_eingefahren;
                fire("Fstr_fg_egf_frei");
                return true;
            }
        }
        //check if Fstr_fg_1_belegt can fire
        if ( (Fstr_fg_P1 >= 1) &&
                (Fstr_fg_P2 <= 0) &&
                (Iso_1_belegt >= 1))
        {
            if (canFire("Fstr_fg_1_belegt"))
            {
                --Fstr_fg_P1;
                ++Fstr_fg_P2;
                fire("Fstr_fg_1_belegt");
                return true;
            }
        }
        //check if Fstr_fg_egf_belegt can fire
        if ( (Iso_egf_belegt >= 1) &&
                (Fstr_fg_P1 <= 0))
        {
            if (canFire("Fstr_fg_egf_belegt"))
            {
                ++Fstr_fg_P1;
                fire("Fstr_fg_egf_belegt");
                return true;
            }
        }
        //check if Fstr_fg_Signal_haltstellen can fire
        if ( (Fstr_fg_P2 >= 1) &&
                (Fstr_fg_F_Fahrt3 >= 1) &&
                (Fstr_fg_F_Halt <= 1))
        {
            if (canFire("Fstr_fg_Signal_haltstellen"))
            {
                --Fstr_fg_F_Fahrt3;
                ++Fstr_fg_F_Halt;
                fire("Fstr_fg_Signal_haltstellen");
                return true;
            }
        }
        //check if Fstr_fg_Signal_fahrtstellen can fire
        if ( (Fstr_fg_verschlossen >= 1) &&
                (Fstr_fg_F_Fahrt3 <= 0) &&
                (Fstr_fg_F_Halt >= 1) &&
                (Kontakte_8_FSS_90F >= 1))
        {
            if (canFire("Fstr_fg_Signal_fahrtstellen"))
            {
                ++Fstr_fg_F_Fahrt3;
                --Fstr_fg_F_Halt;
                fire("Fstr_fg_Signal_fahrtstellen");
                return true;
            }
        }
        //check if Fstr_fg_verschliessen can fire
        if ( (Fstr_fg_geprueft2 >= 1) &&
                (Fstr_fg_verschlossen <= 0) &&
                (Kontakte_8_FSS_45F >= 1))
        {
            if (canFire("Fstr_fg_verschliessen"))
            {
                --Fstr_fg_geprueft2;
                ++Fstr_fg_verschlossen;
                fire("Fstr_fg_verschliessen");
                return true;
            }
        }
        //check if Fstr_fg_pruefen1 can fire
        if ( (Fstr_fg_aufgeloest >= 1) &&
                (Kontakte_8_FSS_30F >= 1) &&
                (W1_Endlage_minus >= 1) &&
                (Fstr_fg_geprueft0 <= 0))
        {
            if (canFire("Fstr_fg_pruefen1"))
            {
                --Fstr_fg_aufgeloest;
                ++Fstr_fg_geprueft0;
                fire("Fstr_fg_pruefen1");
                return true;
            }
        }
        //check if Fstr_fg_Stoerung can fire
        if ( (Fstr_fg_F_Fahrt3 >= 1) &&
                (Fstr_fg_Stoerung_F >= 1) &&
                (Fstr_fg_F_Halt <= 1))
        {
            if (canFire("Fstr_fg_Stoerung"))
            {
                --Fstr_fg_F_Fahrt3;
                ++Fstr_fg_F_Halt;
                fire("Fstr_fg_Stoerung");
                return true;
            }
        }
        //check if Fstr_fg_T1 can fire
        if ( (Fstr_fg_geprueft1 >= 1) &&
                (Fstr_fg_geprueft2 <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1))
        {
            if (canFire("Fstr_fg_T1"))
            {
                --Fstr_fg_geprueft1;
                ++Fstr_fg_geprueft2;
                fire("Fstr_fg_T1");
                return true;
            }
        }
        //check if Fstr_fg_notaufloesen can fire
        if ( (Fstr_fg_verschlossen >= 1) &&
                (Fstr_fg_aufgeloest <= 0) &&
                (Kontakte_6_NAL >= 1))
        {
            if (canFire("Fstr_fg_notaufloesen"))
            {
                --Fstr_fg_verschlossen;
                ++Fstr_fg_aufgeloest;
                fire("Fstr_fg_notaufloesen");
                return true;
            }
        }
        //check if Fstr_fg_T4_1 can fire
        if ( (Fstr_fg_geprueft0 >= 1) &&
                (Fstr_fg_geprueft1 <= 0) &&
                (Iso_1_frei >= 1) &&
                (Iso_egf_frei >= 1))
        {
            if (canFire("Fstr_fg_T4_1"))
            {
                --Fstr_fg_geprueft0;
                ++Fstr_fg_geprueft1;
                fire("Fstr_fg_T4_1");
                return true;
            }
        }
        //check if Fstr_fg_T5 can fire
        if ( (Fstr_fg_geprueft0 >= 1) &&
                (Fstr_fg_geprueft1 <= 0) &&
                (Kontakte_6_ISU_Sign >= 1))
        {
            if (canFire("Fstr_fg_T5"))
            {
                --Fstr_fg_geprueft0;
                ++Fstr_fg_geprueft1;
                fire("Fstr_fg_T5");
                return true;
            }
        }
        //check if Iso_1_Einfahrt_Fz can fire
        if ( (Iso_1_belegt <= 0) &&
                (Iso_1_Zug_einfahren >= 1) &&
                (Iso_1_frei >= 1))
        {
            if (canFire("Iso_1_Einfahrt_Fz"))
            {
                ++Iso_1_belegt;
                --Iso_1_Zug_einfahren;
                --Iso_1_frei;
                fire("Iso_1_Einfahrt_Fz");
                return true;
            }
        }
        //check if Iso_1_Ausfahrt_Fz can fire
        if ( (Iso_1_belegt >= 1) &&
                (Iso_1_frei <= 0) &&
                (Iso_1_Zug_ausfahren >= 1))
        {
            if (canFire("Iso_1_Ausfahrt_Fz"))
            {
                --Iso_1_belegt;
                ++Iso_1_frei;
                --Iso_1_Zug_ausfahren;
                fire("Iso_1_Ausfahrt_Fz");
                return true;
            }
        }
        //check if Iso_gf_Einfahrt_Fz can fire
        if ( (Iso_gf_Zug_einfahren >= 1) &&
                (Iso_gf_frei >= 1) &&
                (Iso_gf_belegt <= 0))
        {
            if (canFire("Iso_gf_Einfahrt_Fz"))
            {
                --Iso_gf_Zug_einfahren;
                --Iso_gf_frei;
                ++Iso_gf_belegt;
                fire("Iso_gf_Einfahrt_Fz");
                return true;
            }
        }
        //check if Iso_gf_Ausfahrt_Fz can fire
        if ( (Iso_gf_frei <= 0) &&
                (Iso_gf_Zug_ausfahren >= 1) &&
                (Iso_gf_belegt >= 1))
        {
            if (canFire("Iso_gf_Ausfahrt_Fz"))
            {
                ++Iso_gf_frei;
                --Iso_gf_Zug_ausfahren;
                --Iso_gf_belegt;
                fire("Iso_gf_Ausfahrt_Fz");
                return true;
            }
        }
        //check if Iso_egf_Einfahrt_Fz can fire
        if ( (Iso_egf_frei >= 1) &&
                (Iso_egf_Zug_einfahren >= 1) &&
                (Iso_egf_belegt <= 0))
        {
            if (canFire("Iso_egf_Einfahrt_Fz"))
            {
                --Iso_egf_frei;
                --Iso_egf_Zug_einfahren;
                ++Iso_egf_belegt;
                fire("Iso_egf_Einfahrt_Fz");
                return true;
            }
        }
        //check if Iso_egf_Ausfahrt_Fz can fire
        if ( (Iso_egf_frei <= 0) &&
                (Iso_egf_belegt >= 1) &&
                (Iso_egf_Zug_ausfahren >= 1))
        {
            if (canFire("Iso_egf_Ausfahrt_Fz"))
            {
                ++Iso_egf_frei;
                --Iso_egf_belegt;
                --Iso_egf_Zug_ausfahren;
                fire("Iso_egf_Ausfahrt_Fz");
                return true;
            }
        }
        //check if Iso_cd_Einfahrt_Fz can fire
        if ( (Iso_cd_Zug_einfahren >= 1) &&
                (Iso_cd_belegt <= 0) &&
                (Iso_cd_frei >= 1))
        {
            if (canFire("Iso_cd_Einfahrt_Fz"))
            {
                --Iso_cd_Zug_einfahren;
                ++Iso_cd_belegt;
                --Iso_cd_frei;
                fire("Iso_cd_Einfahrt_Fz");
                return true;
            }
        }
        //check if Iso_cd_Ausfahrt_Fz can fire
        if ( (Iso_cd_belegt >= 1) &&
                (Iso_cd_Zug_ausfahren >= 1) &&
                (Iso_cd_frei <= 0))
        {
            if (canFire("Iso_cd_Ausfahrt_Fz"))
            {
                --Iso_cd_belegt;
                --Iso_cd_Zug_ausfahren;
                ++Iso_cd_frei;
                fire("Iso_cd_Ausfahrt_Fz");
                return true;
            }
        }
        //check if Lampen_T14 can fire
        if ( (ext_Vb_F_VS_Lampe_Warn_def >= 1) &&
                (Lampen_1_F_VS_Stoer <= 0))
        {
            if (canFire("Lampen_T14"))
            {
                ++Lampen_1_F_VS_Stoer;
                fire("Lampen_T14");
                return true;
            }
        }
        //check if Lampen_T15 can fire
        if ( (ext_Vb_F_VS_Lampe_Fahrt_def >= 1) &&
                (Lampen_1_F_VS_Stoer <= 0))
        {
            if (canFire("Lampen_T15"))
            {
                ++Lampen_1_F_VS_Stoer;
                fire("Lampen_T15");
                return true;
            }
        }
        //check if Lampen_T17 can fire
        if ( (ext_Vb_G_VS_Lampe_Warn_def >= 1) &&
                (Lampen_1_G_VS_Stoer <= 0))
        {
            if (canFire("Lampen_T17"))
            {
                ++Lampen_1_G_VS_Stoer;
                fire("Lampen_T17");
                return true;
            }
        }
        //check if Lampen_T318 can fire
        if ( (Lampen_1_G_VS_Stoer <= 0) &&
                (ext_Vb_G_VS_Lampe_Fahrt_def >= 1))
        {
            if (canFire("Lampen_T318"))
            {
                ++Lampen_1_G_VS_Stoer;
                fire("Lampen_T318");
                return true;
            }
        }
        //check if Lampen_T137 can fire
        if ( (Lampen_1_FBV_vLN <= 0) &&
                (ILTIS_anfordern_vLN >= 1) &&
                (Lampen_P34 >= 1))
        {
            if (canFire("Lampen_T137"))
            {
                ++Lampen_1_FBV_vLN;
                --Lampen_P34;
                fire("Lampen_T137");
                return true;
            }
        }
        //check if Lampen_T51 can fire
        if ( (Lampen_P41 >= 1) &&
                (Lampen_1_Stoer_Wecker <= 0))
        {
            if (canFire("Lampen_T51"))
            {
                --Lampen_P41;
                ++Lampen_1_Stoer_Wecker;
                fire("Lampen_T51");
                return true;
            }
        }
        //check if Lampen_T57 can fire
        if ( (Lampen_2_Weiche <= 0) &&
                (Lampen_P1 >= 1) &&
                (W1_Endlage_minus < 1) &&
                (W1_Endlage_plus < 1))
        {
            if (canFire("Lampen_T57"))
            {
                ++Lampen_2_Weiche;
                --Lampen_P1;
                fire("Lampen_T57");
                return true;
            }
        }
        //check if Lampen_T59 can fire
        if ( (Lampen_2_Block <= 0) &&
                (Lampen_P48 >= 1) &&
                (Lampen_P39 >= 1) &&
                (Lampen_P40 >= 1))
        {
            if (canFire("Lampen_T59"))
            {
                ++Lampen_2_Block;
                --Lampen_P48;
                fire("Lampen_T59");
                return true;
            }
        }
        //check if Lampen_T1 can fire
        if ( (ILTIS_anfordern_vZB >= 1) &&
                (Lampen_1_FBV_vZB <= 0) &&
                (Lampen_P33 >= 1))
        {
            if (canFire("Lampen_T1"))
            {
                ++Lampen_1_FBV_vZB;
                --Lampen_P33;
                fire("Lampen_T1");
                return true;
            }
        }
        //check if Lampen_T2 can fire
        if ( (Lampen_1_FBV_vZB >= 1) &&
                (Lampen_P33 <= 0) &&
                (BL_ZB_OM_Grundstlg_v < 1))
        {
            if (canFire("Lampen_T2"))
            {
                --Lampen_1_FBV_vZB;
                ++Lampen_P33;
                fire("Lampen_T2");
                return true;
            }
        }
        //check if Lampen_T3 can fire
        if ( (Lampen_1_FBV_vLN >= 1) &&
                (BL_OM_LN_Grundstlg_v >= 1) &&
                (Lampen_P34 <= 0) &&
                (ILTIS_anfordern_vLN < 1))
        {
            if (canFire("Lampen_T3"))
            {
                --Lampen_1_FBV_vLN;
                ++Lampen_P34;
                fire("Lampen_T3");
                return true;
            }
        }
        //check if Lampen_T4 can fire
        if ( (BL_OM_LN_vorgebl_v >= 1) &&
                (Lampen_1_BL_vLN_rot <= 0) &&
                (Lampen_P4 >= 1))
        {
            if (canFire("Lampen_T4"))
            {
                ++Lampen_1_BL_vLN_rot;
                --Lampen_P4;
                fire("Lampen_T4");
                return true;
            }
        }
        //check if Lampen_T5 can fire
        if ( (Lampen_1_BL_vLN_rot >= 1) &&
                (BL_OM_LN_Grundstlg_v >= 1) &&
                (Lampen_P4 <= 0))
        {
            if (canFire("Lampen_T5"))
            {
                --Lampen_1_BL_vLN_rot;
                ++Lampen_P4;
                fire("Lampen_T5");
                return true;
            }
        }
        //check if Lampen_T6 can fire
        if ( (Lampen_P6 >= 1) &&
                (Fstr_ef_verschlossen >= 1) &&
                (Lampen_1_Fstr_ef <= 0))
        {
            if (canFire("Lampen_T6"))
            {
                --Lampen_P6;
                ++Lampen_1_Fstr_ef;
                fire("Lampen_T6");
                return true;
            }
        }
        //check if Lampen_T7 can fire
        if ( (Lampen_1_Fstr_ef >= 1) &&
                (Lampen_P6 <= 0) &&
                (Fstr_ef_aufgeloest >= 1))
        {
            if (canFire("Lampen_T7"))
            {
                --Lampen_1_Fstr_ef;
                ++Lampen_P6;
                fire("Lampen_T7");
                return true;
            }
        }
        //check if Lampen_T8 can fire
        if ( (Fstr_gf_verschlossen >= 1) &&
                (Lampen_P8 >= 1) &&
                (Lampen_1_Fstr_gf <= 0))
        {
            if (canFire("Lampen_T8"))
            {
                --Lampen_P8;
                ++Lampen_1_Fstr_gf;
                fire("Lampen_T8");
                return true;
            }
        }
        //check if Lampen_T9 can fire
        if ( (Lampen_P8 <= 0) &&
                (Fstr_gf_aufgeloest >= 1) &&
                (Lampen_1_Fstr_gf >= 1))
        {
            if (canFire("Lampen_T9"))
            {
                ++Lampen_P8;
                --Lampen_1_Fstr_gf;
                fire("Lampen_T9");
                return true;
            }
        }
        //check if Lampen_T310 can fire
        if ( (Fstr_fg_aufgeloest >= 1) &&
                (Lampen_P8 <= 0) &&
                (Lampen_1_Fstr_gf >= 1))
        {
            if (canFire("Lampen_T310"))
            {
                ++Lampen_P8;
                --Lampen_1_Fstr_gf;
                fire("Lampen_T310");
                return true;
            }
        }
        //check if Lampen_T311 can fire
        if ( (Lampen_1_Fstr_ef >= 1) &&
                (Fstr_fe_aufgeloest >= 1) &&
                (Lampen_P6 <= 0))
        {
            if (canFire("Lampen_T311"))
            {
                --Lampen_1_Fstr_ef;
                ++Lampen_P6;
                fire("Lampen_T311");
                return true;
            }
        }
        //check if Lampen_T412 can fire
        if ( (Lampen_1_WS1_Ueberw <= 0) &&
                (Lampen_P112 >= 1) &&
                (W1_Endlage_plus >= 1))
        {
            if (canFire("Lampen_T412"))
            {
                ++Lampen_1_WS1_Ueberw;
                --Lampen_P112;
                fire("Lampen_T412");
                return true;
            }
        }
        //check if Lampen_T13 can fire
        if ( (Lampen_1_WS1_Ueberw >= 1) &&
                (Lampen_P112 <= 0) &&
                (W1_Endlage_plus < 1) &&
                (W1_Endlage_minus < 1))
        {
            if (canFire("Lampen_T13"))
            {
                --Lampen_1_WS1_Ueberw;
                ++Lampen_P112;
                fire("Lampen_T13");
                return true;
            }
        }
        //check if Lampen_T16 can fire
        if ( (Lampen_1_WS1_Freig <= 0) &&
                (Lampen_P15 >= 1) &&
                (Stw_WS_Sperrm_ein >= 1))
        {
            if (canFire("Lampen_T16"))
            {
                ++Lampen_1_WS1_Freig;
                --Lampen_P15;
                fire("Lampen_T16");
                return true;
            }
        }
        //check if Lampen_T117 can fire
        if ( (Lampen_1_WS1_Freig >= 1) &&
                (Stw_WS_Sperrm_aus >= 1) &&
                (Lampen_P15 <= 0))
        {
            if (canFire("Lampen_T117"))
            {
                --Lampen_1_WS1_Freig;
                ++Lampen_P15;
                fire("Lampen_T117");
                return true;
            }
        }
        //check if Lampen_T18 can fire
        if ( (Lampen_1_Fstr_ef <= 0) &&
                (Lampen_P6 >= 1) &&
                (Fstr_fe_verschlossen >= 1))
        {
            if (canFire("Lampen_T18"))
            {
                ++Lampen_1_Fstr_ef;
                --Lampen_P6;
                fire("Lampen_T18");
                return true;
            }
        }
        //check if Lampen_T19 can fire
        if ( (Lampen_P8 >= 1) &&
                (Fstr_fg_verschlossen >= 1) &&
                (Lampen_1_Fstr_gf <= 0))
        {
            if (canFire("Lampen_T19"))
            {
                --Lampen_P8;
                ++Lampen_1_Fstr_gf;
                fire("Lampen_T19");
                return true;
            }
        }
        //check if Lampen_T20 can fire
        if ( (Lampen_P112 >= 1) &&
                (W1_Endlage_minus >= 1) &&
                (Lampen_1_WS1_Ueberw <= 0))
        {
            if (canFire("Lampen_T20"))
            {
                --Lampen_P112;
                ++Lampen_1_WS1_Ueberw;
                fire("Lampen_T20");
                return true;
            }
        }
        //check if Lampen_T21 can fire
        if ( (BL_OM_LN_belegt_v >= 1) &&
                (Lampen_1_BL_vLN_rot <= 0) &&
                (Lampen_P4 >= 1))
        {
            if (canFire("Lampen_T21"))
            {
                ++Lampen_1_BL_vLN_rot;
                --Lampen_P4;
                fire("Lampen_T21");
                return true;
            }
        }
        //check if Lampen_T23 can fire
        if ( (Lampen_1_BL_nLN_rot >= 1) &&
                (BL_OM_LN_Grundstlg_n >= 1) &&
                (Lampen_P16 <= 0))
        {
            if (canFire("Lampen_T23"))
            {
                --Lampen_1_BL_nLN_rot;
                ++Lampen_P16;
                fire("Lampen_T23");
                return true;
            }
        }
        //check if Lampen_T24 can fire
        if ( (BL_OM_LN_vorgebl_n >= 1) &&
                (Lampen_1_BL_nLN_rot <= 0) &&
                (Lampen_P16 >= 1))
        {
            if (canFire("Lampen_T24"))
            {
                ++Lampen_1_BL_nLN_rot;
                --Lampen_P16;
                fire("Lampen_T24");
                return true;
            }
        }
        //check if Lampen_T25 can fire
        if ( (Lampen_P16 >= 1) &&
                (BL_OM_LN_belegt_n >= 1) &&
                (Lampen_1_BL_nLN_rot <= 0))
        {
            if (canFire("Lampen_T25"))
            {
                --Lampen_P16;
                ++Lampen_1_BL_nLN_rot;
                fire("Lampen_T25");
                return true;
            }
        }
        //check if Lampen_T126 can fire
        if ( (Lampen_P17 <= 0) &&
                (Fstr_fe_F_Fahrt1 >= 1) &&
                (Lampen_1_F_rot >= 1))
        {
            if (canFire("Lampen_T126"))
            {
                ++Lampen_P17;
                --Lampen_1_F_rot;
                fire("Lampen_T126");
                return true;
            }
        }
        //check if Lampen_T127 can fire
        if ( (Lampen_P17 >= 1) &&
                (Lampen_1_F_rot <= 0) &&
                (Fstr_fe_F_Halt >= 1))
        {
            if (canFire("Lampen_T127"))
            {
                --Lampen_P17;
                ++Lampen_1_F_rot;
                fire("Lampen_T127");
                return true;
            }
        }
        //check if Lampen_T128 can fire
        if ( (Lampen_P17 >= 1) &&
                (Lampen_1_F_rot <= 0) &&
                (Fstr_fg_F_Halt >= 1))
        {
            if (canFire("Lampen_T128"))
            {
                --Lampen_P17;
                ++Lampen_1_F_rot;
                fire("Lampen_T128");
                return true;
            }
        }
        //check if Lampen_T129 can fire
        if ( (Lampen_P17 <= 0) &&
                (Lampen_1_F_rot >= 1) &&
                (Fstr_fg_F_Fahrt3 >= 1))
        {
            if (canFire("Lampen_T129"))
            {
                ++Lampen_P17;
                --Lampen_1_F_rot;
                fire("Lampen_T129");
                return true;
            }
        }
        //check if Lampen_T130 can fire
        if ( (Fstr_fe_F_Halt >= 1) &&
                (Lampen_1_F_gruenFB1 >= 1) &&
                (Lampen_P20 <= 0))
        {
            if (canFire("Lampen_T130"))
            {
                --Lampen_1_F_gruenFB1;
                ++Lampen_P20;
                fire("Lampen_T130");
                return true;
            }
        }
        //check if Lampen_T131 can fire
        if ( (Fstr_fe_F_Fahrt1 >= 1) &&
                (Lampen_1_F_gruenFB1 <= 0) &&
                (Lampen_P20 >= 1))
        {
            if (canFire("Lampen_T131"))
            {
                ++Lampen_1_F_gruenFB1;
                --Lampen_P20;
                fire("Lampen_T131");
                return true;
            }
        }
        //check if Lampen_T32 can fire
        if ( (Lampen_1_F_gruenFB1 >= 1) &&
                (Fstr_fg_F_Halt >= 1) &&
                (Lampen_P20 <= 0))
        {
            if (canFire("Lampen_T32"))
            {
                --Lampen_1_F_gruenFB1;
                ++Lampen_P20;
                fire("Lampen_T32");
                return true;
            }
        }
        //check if Lampen_T33 can fire
        if ( (Fstr_fg_F_Fahrt3 >= 1) &&
                (Lampen_1_F_gruenFB1 <= 0) &&
                (Lampen_P20 >= 1))
        {
            if (canFire("Lampen_T33"))
            {
                ++Lampen_1_F_gruenFB1;
                --Lampen_P20;
                fire("Lampen_T33");
                return true;
            }
        }
        //check if Lampen_T34 can fire
        if ( (Lampen_1_BL_nLN_weiss >= 1) &&
                (Lampen_P23 <= 0) &&
                (BL_OM_LN_Grundstlg_n < 1) &&
                (BL_OM_LN_vorgebl_n < 1))
        {
            if (canFire("Lampen_T34"))
            {
                --Lampen_1_BL_nLN_weiss;
                ++Lampen_P23;
                fire("Lampen_T34");
                return true;
            }
        }
        //check if Lampen_T35 can fire
        if ( (Lampen_1_BL_nLN_weiss <= 0) &&
                (BL_OM_LN_Grundstlg_n >= 1) &&
                (Lampen_P23 >= 1))
        {
            if (canFire("Lampen_T35"))
            {
                ++Lampen_1_BL_nLN_weiss;
                --Lampen_P23;
                fire("Lampen_T35");
                return true;
            }
        }
        //check if Lampen_T136 can fire
        if ( (Lampen_1_BL_nLN_weiss <= 0) &&
                (BL_OM_LN_vorgebl_n >= 1) &&
                (Lampen_P23 >= 1))
        {
            if (canFire("Lampen_T136"))
            {
                ++Lampen_1_BL_nLN_weiss;
                --Lampen_P23;
                fire("Lampen_T136");
                return true;
            }
        }
        //check if Lampen_T138 can fire
        if ( (Lampen_1_BL_vLN_weiss >= 1) &&
                (Lampen_P26 <= 0) &&
                (BL_OM_LN_Grundstlg_v < 1))
        {
            if (canFire("Lampen_T138"))
            {
                --Lampen_1_BL_vLN_weiss;
                ++Lampen_P26;
                fire("Lampen_T138");
                return true;
            }
        }
        //check if Lampen_T139 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (Lampen_1_BL_vLN_weiss <= 0) &&
                (Lampen_P26 >= 1))
        {
            if (canFire("Lampen_T139"))
            {
                ++Lampen_1_BL_vLN_weiss;
                --Lampen_P26;
                fire("Lampen_T139");
                return true;
            }
        }
        //check if Lampen_T140 can fire
        if ( (Lampen_1_BL_vLN_weiss >= 1) &&
                (Lampen_P26 <= 0) &&
                (BL_OM_LN_belegt_v >= 1))
        {
            if (canFire("Lampen_T140"))
            {
                --Lampen_1_BL_vLN_weiss;
                ++Lampen_P26;
                fire("Lampen_T140");
                return true;
            }
        }
        //check if Lampen_T141 can fire
        if ( (Lampen_P26 >= 1) &&
                (BL_OM_LN_vorgebl_v >= 1) &&
                (Lampen_1_BL_vLN_weiss <= 0))
        {
            if (canFire("Lampen_T141"))
            {
                --Lampen_P26;
                ++Lampen_1_BL_vLN_weiss;
                fire("Lampen_T141");
                return true;
            }
        }
        //check if Lampen_T42 can fire
        if ( (Lampen_1_BL_vZB_rot >= 1) &&
                (Lampen_P30 <= 0) &&
                (BL_ZB_OM_Grundstlg_v >= 1))
        {
            if (canFire("Lampen_T42"))
            {
                --Lampen_1_BL_vZB_rot;
                ++Lampen_P30;
                fire("Lampen_T42");
                return true;
            }
        }
        //check if Lampen_T43 can fire
        if ( (Lampen_1_BL_vZB_rot <= 0) &&
                (Lampen_P30 >= 1) &&
                (BL_ZB_OM_vorgebl_v >= 1))
        {
            if (canFire("Lampen_T43"))
            {
                ++Lampen_1_BL_vZB_rot;
                --Lampen_P30;
                fire("Lampen_T43");
                return true;
            }
        }
        //check if Lampen_T45 can fire
        if ( (Lampen_P30 >= 1) &&
                (BL_ZB_OM_belegt_v >= 1) &&
                (Lampen_1_BL_vZB_rot <= 0))
        {
            if (canFire("Lampen_T45"))
            {
                --Lampen_P30;
                ++Lampen_1_BL_vZB_rot;
                fire("Lampen_T45");
                return true;
            }
        }
        //check if Lampen_T46 can fire
        if ( (Lampen_P32 <= 0) &&
                (Lampen_1_BL_vZB_weiss >= 1) &&
                (BL_ZB_OM_vorgebl_v < 1))
        {
            if (canFire("Lampen_T46"))
            {
                ++Lampen_P32;
                --Lampen_1_BL_vZB_weiss;
                fire("Lampen_T46");
                return true;
            }
        }
        //check if Lampen_T47 can fire
        if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
                (Lampen_P32 >= 1) &&
                (Lampen_1_BL_vZB_weiss <= 0))
        {
            if (canFire("Lampen_T47"))
            {
                --Lampen_P32;
                ++Lampen_1_BL_vZB_weiss;
                fire("Lampen_T47");
                return true;
            }
        }
        //check if Lampen_T48 can fire
        if ( (Lampen_1_BL_vZB_weiss >= 1) &&
                (Lampen_P32 <= 0) &&
                (BL_ZB_OM_belegt_v >= 1))
        {
            if (canFire("Lampen_T48"))
            {
                --Lampen_1_BL_vZB_weiss;
                ++Lampen_P32;
                fire("Lampen_T48");
                return true;
            }
        }
        //check if Lampen_T49 can fire
        if ( (BL_ZB_OM_vorgebl_v >= 1) &&
                (Lampen_P32 >= 1) &&
                (Lampen_1_BL_vZB_weiss <= 0))
        {
            if (canFire("Lampen_T49"))
            {
                --Lampen_P32;
                ++Lampen_1_BL_vZB_weiss;
                fire("Lampen_T49");
                return true;
            }
        }
        //check if Lampen_T351 can fire
        if ( (Lampen_1_BL_nZB_rot >= 1) &&
                (Lampen_P35 <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1))
        {
            if (canFire("Lampen_T351"))
            {
                --Lampen_1_BL_nZB_rot;
                ++Lampen_P35;
                fire("Lampen_T351");
                return true;
            }
        }
        //check if Lampen_T52 can fire
        if ( (Lampen_1_BL_nZB_rot <= 0) &&
                (Lampen_P35 >= 1) &&
                (BL_ZB_OM_belegt_n >= 1))
        {
            if (canFire("Lampen_T52"))
            {
                ++Lampen_1_BL_nZB_rot;
                --Lampen_P35;
                fire("Lampen_T52");
                return true;
            }
        }
        //check if Lampen_T54 can fire
        if ( (BL_ZB_OM_vorgebl_n >= 1) &&
                (Lampen_P35 >= 1) &&
                (Lampen_1_BL_nZB_rot <= 0))
        {
            if (canFire("Lampen_T54"))
            {
                --Lampen_P35;
                ++Lampen_1_BL_nZB_rot;
                fire("Lampen_T54");
                return true;
            }
        }
        //check if Lampen_T55 can fire
        if ( (Lampen_1_BL_nZB_weiss >= 1) &&
                (Lampen_P38 <= 0) &&
                (BL_ZB_OM_vorgebl_n < 1) &&
                (BL_ZB_OM_Grundstlg_n < 1))
        {
            if (canFire("Lampen_T55"))
            {
                --Lampen_1_BL_nZB_weiss;
                ++Lampen_P38;
                fire("Lampen_T55");
                return true;
            }
        }
        //check if Lampen_T56 can fire
        if ( (BL_ZB_OM_Grundstlg_n >= 1) &&
                (Lampen_1_BL_nZB_weiss <= 0) &&
                (Lampen_P38 >= 1))
        {
            if (canFire("Lampen_T56"))
            {
                ++Lampen_1_BL_nZB_weiss;
                --Lampen_P38;
                fire("Lampen_T56");
                return true;
            }
        }
        //check if Lampen_T58 can fire
        if ( (Lampen_1_BL_nZB_weiss <= 0) &&
                (BL_ZB_OM_vorgebl_n >= 1) &&
                (Lampen_P38 >= 1))
        {
            if (canFire("Lampen_T58"))
            {
                ++Lampen_1_BL_nZB_weiss;
                --Lampen_P38;
                fire("Lampen_T58");
                return true;
            }
        }
        //check if Lampen_T301 can fire
        if ( (Lampen_2_Weiche >= 1) &&
                (W1_Endlage_minus >= 1) &&
                (Lampen_P1 <= 0))
        {
            if (canFire("Lampen_T301"))
            {
                --Lampen_2_Weiche;
                ++Lampen_P1;
                fire("Lampen_T301");
                return true;
            }
        }
        //check if Lampen_T302 can fire
        if ( (Lampen_2_Weiche >= 1) &&
                (W1_Endlage_plus >= 1) &&
                (Lampen_P1 <= 0))
        {
            if (canFire("Lampen_T302"))
            {
                --Lampen_2_Weiche;
                ++Lampen_P1;
                fire("Lampen_T302");
                return true;
            }
        }
        //check if Lampen_T10 can fire
        if ( (Lampen_P49 >= 1) &&
                (Lampen_P12 >= 1) &&
                (Lampen_2_Signal <= 0))
        {
            if (canFire("Lampen_T10"))
            {
                --Lampen_P49;
                ++Lampen_2_Signal;
                fire("Lampen_T10");
                return true;
            }
        }
        //check if Lampen_T11 can fire
        if ( (Lampen_P49 >= 1) &&
                (Lampen_2_Signal <= 0) &&
                (Lampen_P117 >= 1))
        {
            if (canFire("Lampen_T11"))
            {
                --Lampen_P49;
                ++Lampen_2_Signal;
                fire("Lampen_T11");
                return true;
            }
        }
        //check if Lampen_T12 can fire
        if ( (Lampen_P49 >= 1) &&
                (Lampen_P21 >= 1) &&
                (Lampen_2_Signal <= 0))
        {
            if (canFire("Lampen_T12"))
            {
                --Lampen_P49;
                ++Lampen_2_Signal;
                fire("Lampen_T12");
                return true;
            }
        }
        //check if Lampen_T313 can fire
        if ( (Lampen_P12 < 1) &&
                (Lampen_P21 < 1) &&
                (Lampen_P49 <= 0) &&
                (Lampen_2_Signal >= 1) &&
                (Lampen_P117 < 1))
        {
            if (canFire("Lampen_T313"))
            {
                ++Lampen_P49;
                --Lampen_2_Signal;
                fire("Lampen_T313");
                return true;
            }
        }
        //check if Lampen_T314 can fire
        if ( (Lampen_P12 >= 1) &&
                (Fstr_ef_E_Halt >= 1) &&
                (Lampen_P13 <= 0))
        {
            if (canFire("Lampen_T314"))
            {
                --Lampen_P12;
                ++Lampen_P13;
                fire("Lampen_T314");
                return true;
            }
        }
        //check if Lampen_T315 can fire
        if ( (Fstr_ef_E_Halt < 1) &&
                (Lampen_P12 <= 0) &&
                (Lampen_P13 >= 1) &&
                (Fstr_ef_E_Fahrt1 < 1))
        {
            if (canFire("Lampen_T315"))
            {
                ++Lampen_P12;
                --Lampen_P13;
                fire("Lampen_T315");
                return true;
            }
        }
        //check if Lampen_T316 can fire
        if ( (Lampen_P12 >= 1) &&
                (Fstr_ef_E_Fahrt1 >= 1) &&
                (Lampen_P13 <= 0))
        {
            if (canFire("Lampen_T316"))
            {
                --Lampen_P12;
                ++Lampen_P13;
                fire("Lampen_T316");
                return true;
            }
        }
        //check if Lampen_T118 can fire
        if ( (Lampen_P117 >= 1) &&
                (Fstr_gf_G_Halt >= 1) &&
                (Lampen_P18 <= 0))
        {
            if (canFire("Lampen_T118"))
            {
                --Lampen_P117;
                ++Lampen_P18;
                fire("Lampen_T118");
                return true;
            }
        }
        //check if Lampen_T119 can fire
        if ( (Fstr_gf_G_Fahrt3 < 1) &&
                (Fstr_gf_G_Halt < 1) &&
                (Lampen_P18 >= 1) &&
                (Lampen_P117 <= 0))
        {
            if (canFire("Lampen_T119"))
            {
                --Lampen_P18;
                ++Lampen_P117;
                fire("Lampen_T119");
                return true;
            }
        }
        //check if Lampen_T120 can fire
        if ( (Lampen_P117 >= 1) &&
                (Fstr_gf_G_Fahrt3 >= 1) &&
                (Lampen_P18 <= 0))
        {
            if (canFire("Lampen_T120"))
            {
                --Lampen_P117;
                ++Lampen_P18;
                fire("Lampen_T120");
                return true;
            }
        }
        //check if Lampen_T121 can fire
        if ( (Lampen_P21 >= 1) &&
                (Fstr_fe_F_Halt >= 1) &&
                (Lampen_P22 <= 0))
        {
            if (canFire("Lampen_T121"))
            {
                --Lampen_P21;
                ++Lampen_P22;
                fire("Lampen_T121");
                return true;
            }
        }
        //check if Lampen_T22 can fire
        if ( (Fstr_fg_F_Fahrt3 < 1) &&
                (Fstr_fe_F_Fahrt1 < 1) &&
                (Lampen_P21 <= 0) &&
                (Fstr_fe_F_Halt < 1) &&
                (Lampen_P22 >= 1))
        {
            if (canFire("Lampen_T22"))
            {
                ++Lampen_P21;
                --Lampen_P22;
                fire("Lampen_T22");
                return true;
            }
        }
        //check if Lampen_T123 can fire
        if ( (Fstr_fe_F_Fahrt1 >= 1) &&
                (Lampen_P21 >= 1) &&
                (Lampen_P22 <= 0))
        {
            if (canFire("Lampen_T123"))
            {
                --Lampen_P21;
                ++Lampen_P22;
                fire("Lampen_T123");
                return true;
            }
        }
        //check if Lampen_T124 can fire
        if ( (Lampen_P21 >= 1) &&
                (Lampen_P22 <= 0) &&
                (Fstr_fg_F_Fahrt3 >= 1))
        {
            if (canFire("Lampen_T124"))
            {
                --Lampen_P21;
                ++Lampen_P22;
                fire("Lampen_T124");
                return true;
            }
        }
        //check if Lampen_T26 can fire
        if ( (Lampen_2_Block >= 1) &&
                (Lampen_P48 <= 0) &&
                (Lampen_P39 < 1) &&
                (Lampen_P40 < 1))
        {
            if (canFire("Lampen_T26"))
            {
                --Lampen_2_Block;
                ++Lampen_P48;
                fire("Lampen_T26");
                return true;
            }
        }
        //check if Lampen_T27 can fire
        if ( (BL_OM_LN_Grundstlg_n >= 1) &&
                (Lampen_P27 <= 0) &&
                (Lampen_P40 >= 1))
        {
            if (canFire("Lampen_T27"))
            {
                ++Lampen_P27;
                --Lampen_P40;
                fire("Lampen_T27");
                return true;
            }
        }
        //check if Lampen_T28 can fire
        if ( (Lampen_P27 >= 1) &&
                (BL_OM_LN_Grundstlg_n < 1) &&
                (BL_OM_LN_belegt_n < 1) &&
                (BL_OM_LN_Grundstlg_v < 1) &&
                (BL_OM_LN_belegt_v < 1) &&
                (BL_OM_LN_vorgebl_n < 1) &&
                (BL_OM_LN_vorgebl_v < 1) &&
                (Lampen_P40 <= 0))
        {
            if (canFire("Lampen_T28"))
            {
                --Lampen_P27;
                ++Lampen_P40;
                fire("Lampen_T28");
                return true;
            }
        }
        //check if Lampen_T29 can fire
        if ( (Lampen_P40 >= 1) &&
                (BL_OM_LN_vorgebl_n >= 1) &&
                (Lampen_P27 <= 0))
        {
            if (canFire("Lampen_T29"))
            {
                --Lampen_P40;
                ++Lampen_P27;
                fire("Lampen_T29");
                return true;
            }
        }
        //check if Lampen_T30 can fire
        if ( (BL_OM_LN_belegt_n >= 1) &&
                (Lampen_P40 >= 1) &&
                (Lampen_P27 <= 0))
        {
            if (canFire("Lampen_T30"))
            {
                --Lampen_P40;
                ++Lampen_P27;
                fire("Lampen_T30");
                return true;
            }
        }
        //check if Lampen_T31 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (Lampen_P40 >= 1) &&
                (Lampen_P27 <= 0))
        {
            if (canFire("Lampen_T31"))
            {
                --Lampen_P40;
                ++Lampen_P27;
                fire("Lampen_T31");
                return true;
            }
        }
        //check if Lampen_T132 can fire
        if ( (Lampen_P40 >= 1) &&
                (BL_OM_LN_vorgebl_v >= 1) &&
                (Lampen_P27 <= 0))
        {
            if (canFire("Lampen_T132"))
            {
                --Lampen_P40;
                ++Lampen_P27;
                fire("Lampen_T132");
                return true;
            }
        }
        //check if Lampen_T133 can fire
        if ( (BL_OM_LN_belegt_v >= 1) &&
                (Lampen_P40 >= 1) &&
                (Lampen_P27 <= 0))
        {
            if (canFire("Lampen_T133"))
            {
                --Lampen_P40;
                ++Lampen_P27;
                fire("Lampen_T133");
                return true;
            }
        }
        //check if Lampen_T135 can fire
        if ( (Lampen_P39 >= 1) &&
                (Lampen_P135 <= 0) &&
                (BL_ZB_OM_Grundstlg_n >= 1))
        {
            if (canFire("Lampen_T135"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T135");
                return true;
            }
        }
        //check if Lampen_T36 can fire
        if ( (BL_ZB_OM_vorgebl_v < 1) &&
                (BL_ZB_OM_vorgebl_n < 1) &&
                (BL_ZB_OM_Grundstlg_v < 1) &&
                (Lampen_P135 >= 1) &&
                (BL_ZB_OM_belegt_v < 1) &&
                (BL_ZB_OM_Grundstlg_n < 1) &&
                (Lampen_P39 <= 0) &&
                (BL_ZB_OM_belegt_n < 1))
        {
            if (canFire("Lampen_T36"))
            {
                --Lampen_P135;
                ++Lampen_P39;
                fire("Lampen_T36");
                return true;
            }
        }
        //check if Lampen_T37 can fire
        if ( (Lampen_P39 >= 1) &&
                (BL_ZB_OM_vorgebl_n >= 1) &&
                (Lampen_P135 <= 0))
        {
            if (canFire("Lampen_T37"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T37");
                return true;
            }
        }
        //check if Lampen_T38 can fire
        if ( (Lampen_P39 >= 1) &&
                (Lampen_P135 <= 0) &&
                (BL_ZB_OM_belegt_n >= 1))
        {
            if (canFire("Lampen_T38"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T38");
                return true;
            }
        }
        //check if Lampen_T39 can fire
        if ( (Lampen_P39 >= 1) &&
                (BL_ZB_OM_Grundstlg_v >= 1) &&
                (Lampen_P135 <= 0))
        {
            if (canFire("Lampen_T39"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T39");
                return true;
            }
        }
        //check if Lampen_T40 can fire
        if ( (Lampen_P39 >= 1) &&
                (BL_ZB_OM_vorgebl_v >= 1) &&
                (Lampen_P135 <= 0))
        {
            if (canFire("Lampen_T40"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T40");
                return true;
            }
        }
        //check if Lampen_T41 can fire
        if ( (Lampen_P39 >= 1) &&
                (BL_ZB_OM_belegt_v >= 1) &&
                (Lampen_P135 <= 0))
        {
            if (canFire("Lampen_T41"))
            {
                --Lampen_P39;
                ++Lampen_P135;
                fire("Lampen_T41");
                return true;
            }
        }
        //check if Lampen_T91 can fire
        if ( (Lampen_Iso_cd_aus >= 1) &&
                (Lampen_Iso_cd_ein <= 0) &&
                (Iso_cd_belegt >= 1))
        {
            if (canFire("Lampen_T91"))
            {
                --Lampen_Iso_cd_aus;
                ++Lampen_Iso_cd_ein;
                fire("Lampen_T91");
                return true;
            }
        }
        //check if Lampen_T92 can fire
        if ( (Lampen_Iso_cd_aus <= 0) &&
                (Lampen_Iso_cd_ein >= 1) &&
                (Iso_cd_frei >= 1))
        {
            if (canFire("Lampen_T92"))
            {
                ++Lampen_Iso_cd_aus;
                --Lampen_Iso_cd_ein;
                fire("Lampen_T92");
                return true;
            }
        }
        //check if Lampen_T95 can fire
        if ( (Lampen_Iso_1_aus >= 1) &&
                (Iso_1_belegt >= 1) &&
                (Lampen_Iso_1_ein <= 0))
        {
            if (canFire("Lampen_T95"))
            {
                --Lampen_Iso_1_aus;
                ++Lampen_Iso_1_ein;
                fire("Lampen_T95");
                return true;
            }
        }
        //check if Lampen_T96 can fire
        if ( (Lampen_Iso_1_ein >= 1) &&
                (Iso_1_frei >= 1) &&
                (Lampen_Iso_1_aus <= 0))
        {
            if (canFire("Lampen_T96"))
            {
                --Lampen_Iso_1_ein;
                ++Lampen_Iso_1_aus;
                fire("Lampen_T96");
                return true;
            }
        }
        //check if Lampen_T93 can fire
        if ( (Iso_egf_belegt >= 1) &&
                (Lampen_Iso_egf_aus >= 1) &&
                (Lampen_Iso_egf_ein <= 0))
        {
            if (canFire("Lampen_T93"))
            {
                --Lampen_Iso_egf_aus;
                ++Lampen_Iso_egf_ein;
                fire("Lampen_T93");
                return true;
            }
        }
        //check if Lampen_T94 can fire
        if ( (Lampen_Iso_egf_aus <= 0) &&
                (Lampen_Iso_egf_ein >= 1) &&
                (Iso_egf_frei >= 1))
        {
            if (canFire("Lampen_T94"))
            {
                ++Lampen_Iso_egf_aus;
                --Lampen_Iso_egf_ein;
                fire("Lampen_T94");
                return true;
            }
        }
        //check if Lampen_T97 can fire
        if ( (Lampen_Iso_ef_aus >= 1) &&
                (Iso_ef_belegt >= 1) &&
                (Lampen_Iso_ef_ein <= 0))
        {
            if (canFire("Lampen_T97"))
            {
                --Lampen_Iso_ef_aus;
                ++Lampen_Iso_ef_ein;
                fire("Lampen_T97");
                return true;
            }
        }
        //check if Lampen_T98 can fire
        if ( (Lampen_Iso_ef_aus <= 0) &&
                (Iso_ef_frei >= 1) &&
                (Lampen_Iso_ef_ein >= 1))
        {
            if (canFire("Lampen_T98"))
            {
                ++Lampen_Iso_ef_aus;
                --Lampen_Iso_ef_ein;
                fire("Lampen_T98");
                return true;
            }
        }
        //check if EMM_T1 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (ILTIS_EMM_1_833 >= 1) &&
                (EMM_geprueft1A1 <= 0))
        {
            if (canFire("EMM_T1"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1A1;
                fire("EMM_T1");
                return true;
            }
        }
        //check if EMM_T2 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (ILTIS_EMM_2_833 >= 1) &&
                (EMM_geprueft1A2 <= 0))
        {
            if (canFire("EMM_T2"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1A2;
                fire("EMM_T2");
                return true;
            }
        }
        //check if EMM_T3 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (ILTIS_EMM_3_833 >= 1) &&
                (EMM_geprueft1A3 <= 0))
        {
            if (canFire("EMM_T3"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1A3;
                fire("EMM_T3");
                return true;
            }
        }
        //check if EMM_T4 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (EMM_geprueft1A4 <= 0) &&
                (ILTIS_EMM_4_833 >= 1))
        {
            if (canFire("EMM_T4"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1A4;
                fire("EMM_T4");
                return true;
            }
        }
        //check if EMM_T5 can fire
        if ( (EMM_geprueft1A5 <= 0) &&
                (ILTIS_EMM_5_833 >= 1) &&
                (EMM_EMM_Grundstlg >= 1))
        {
            if (canFire("EMM_T5"))
            {
                ++EMM_geprueft1A5;
                --EMM_EMM_Grundstlg;
                fire("EMM_T5");
                return true;
            }
        }
        //check if EMM_T6 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (ILTIS_EMM_833_1 >= 1) &&
                (EMM_geprueft1E1 <= 0))
        {
            if (canFire("EMM_T6"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1E1;
                fire("EMM_T6");
                return true;
            }
        }
        //check if EMM_T7 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (EMM_geprueft1E2 <= 0) &&
                (ILTIS_EMM_833_2 >= 1))
        {
            if (canFire("EMM_T7"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1E2;
                fire("EMM_T7");
                return true;
            }
        }
        //check if EMM_T8 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (EMM_geprueft1E3 <= 0) &&
                (ILTIS_EMM_833_3 >= 1))
        {
            if (canFire("EMM_T8"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1E3;
                fire("EMM_T8");
                return true;
            }
        }
        //check if EMM_T9 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (EMM_geprueft1E4 <= 0) &&
                (ILTIS_EMM_833_4 >= 1))
        {
            if (canFire("EMM_T9"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1E4;
                fire("EMM_T9");
                return true;
            }
        }
        //check if EMM_T10 can fire
        if ( (EMM_EMM_Grundstlg >= 1) &&
                (ILTIS_EMM_833_5 >= 1) &&
                (EMM_geprueft1E5 <= 0))
        {
            if (canFire("EMM_T10"))
            {
                --EMM_EMM_Grundstlg;
                ++EMM_geprueft1E5;
                fire("EMM_T10");
                return true;
            }
        }
        //check if EMM_W7_mA1 can fire
        if ( (EMM_EMM_W7_mA1 <= 0) &&
                (EMM_geprueft2A1 >= 1))
        {
            if (canFire("EMM_W7_mA1"))
            {
                ++EMM_EMM_W7_mA1;
                --EMM_geprueft2A1;
                fire("EMM_W7_mA1");
                return true;
            }
        }
        //check if EMM_W10_pA1 can fire
        if ( (EMM_EMM_W7_mA1 >= 1) &&
                (EMM_EMM_W10_pA1 <= 0))
        {
            if (canFire("EMM_W10_pA1"))
            {
                --EMM_EMM_W7_mA1;
                ++EMM_EMM_W10_pA1;
                fire("EMM_W10_pA1");
                return true;
            }
        }
        //check if EMM_pruefen2A1 can fire
        if ( (EMM_geprueft1A1 >= 1) &&
                (EMM_geprueft2A1 <= 0) &&
                (EMM_OM_E_Fahrt >= 1))
        {
            if (canFire("EMM_pruefen2A1"))
            {
                --EMM_geprueft1A1;
                ++EMM_geprueft2A1;
                fire("EMM_pruefen2A1");
                return true;
            }
        }
        //check if EMM_W7_pA2 can fire
        if ( (EMM_geprueft2A2 >= 1) &&
                (EMM_EMM_W7_pA2 <= 0))
        {
            if (canFire("EMM_W7_pA2"))
            {
                --EMM_geprueft2A2;
                ++EMM_EMM_W7_pA2;
                fire("EMM_W7_pA2");
                return true;
            }
        }
        //check if EMM_W10_pA2 can fire
        if ( (EMM_EMM_W7_pA2 >= 1) &&
                (EMM_EMM_W10_pA2 <= 0))
        {
            if (canFire("EMM_W10_pA2"))
            {
                --EMM_EMM_W7_pA2;
                ++EMM_EMM_W10_pA2;
                fire("EMM_W10_pA2");
                return true;
            }
        }
        //check if EMM_pruefen2A2 can fire
        if ( (EMM_geprueft1A2 >= 1) &&
                (EMM_geprueft2A2 <= 0) &&
                (EMM_OM_E_Fahrt >= 1))
        {
            if (canFire("EMM_pruefen2A2"))
            {
                --EMM_geprueft1A2;
                ++EMM_geprueft2A2;
                fire("EMM_pruefen2A2");
                return true;
            }
        }
        //check if EMM_W9_pA3 can fire
        if ( (EMM_geprueft2A3 >= 1) &&
                (EMM_EMM_W9_pA3 <= 0))
        {
            if (canFire("EMM_W9_pA3"))
            {
                --EMM_geprueft2A3;
                ++EMM_EMM_W9_pA3;
                fire("EMM_W9_pA3");
                return true;
            }
        }
        //check if EMM_W10_mA3 can fire
        if ( (EMM_EMM_W9_pA3 >= 1) &&
                (EMM_EMM_W10_mA3 <= 0))
        {
            if (canFire("EMM_W10_mA3"))
            {
                --EMM_EMM_W9_pA3;
                ++EMM_EMM_W10_mA3;
                fire("EMM_W10_mA3");
                return true;
            }
        }
        //check if EMM_pruefen2A3 can fire
        if ( (EMM_geprueft2A3 <= 0) &&
                (EMM_geprueft1A3 >= 1) &&
                (EMM_OM_E_Fahrt >= 1))
        {
            if (canFire("EMM_pruefen2A3"))
            {
                ++EMM_geprueft2A3;
                --EMM_geprueft1A3;
                fire("EMM_pruefen2A3");
                return true;
            }
        }
        //check if EMM_W8_pA4 can fire
        if ( (EMM_geprueft2A4 >= 1) &&
                (EMM_EMM_W8_pA4 <= 0))
        {
            if (canFire("EMM_W8_pA4"))
            {
                --EMM_geprueft2A4;
                ++EMM_EMM_W8_pA4;
                fire("EMM_W8_pA4");
                return true;
            }
        }
        //check if EMM_W9_mA4 can fire
        if ( (EMM_EMM_W8_pA4 >= 1) &&
                (EMM_EMM_W9_mA4 <= 0))
        {
            if (canFire("EMM_W9_mA4"))
            {
                --EMM_EMM_W8_pA4;
                ++EMM_EMM_W9_mA4;
                fire("EMM_W9_mA4");
                return true;
            }
        }
        //check if EMM_pruefen2A4 can fire
        if ( (EMM_geprueft2A4 <= 0) &&
                (EMM_geprueft1A4 >= 1) &&
                (EMM_OM_E_Fahrt >= 1))
        {
            if (canFire("EMM_pruefen2A4"))
            {
                ++EMM_geprueft2A4;
                --EMM_geprueft1A4;
                fire("EMM_pruefen2A4");
                return true;
            }
        }
        //check if EMM_W8_mA5 can fire
        if ( (EMM_geprueft2A5 >= 1) &&
                (EMM_EMM_W8_mA5 <= 0))
        {
            if (canFire("EMM_W8_mA5"))
            {
                --EMM_geprueft2A5;
                ++EMM_EMM_W8_mA5;
                fire("EMM_W8_mA5");
                return true;
            }
        }
        //check if EMM_W9_mA5 can fire
        if ( (EMM_EMM_W9_mA5 <= 0) &&
                (EMM_EMM_W8_mA5 >= 1))
        {
            if (canFire("EMM_W9_mA5"))
            {
                ++EMM_EMM_W9_mA5;
                --EMM_EMM_W8_mA5;
                fire("EMM_W9_mA5");
                return true;
            }
        }
        //check if EMM_pruefen2A5 can fire
        if ( (EMM_geprueft1A5 >= 1) &&
                (EMM_geprueft2A5 <= 0) &&
                (EMM_OM_E_Fahrt >= 1))
        {
            if (canFire("EMM_pruefen2A5"))
            {
                --EMM_geprueft1A5;
                ++EMM_geprueft2A5;
                fire("EMM_pruefen2A5");
                return true;
            }
        }
        //check if EMM_W7_mE1 can fire
        if ( (EMM_EMM_W7_mE1 <= 0) &&
                (EMM_geprueft1E1 >= 1))
        {
            if (canFire("EMM_W7_mE1"))
            {
                ++EMM_EMM_W7_mE1;
                --EMM_geprueft1E1;
                fire("EMM_W7_mE1");
                return true;
            }
        }
        //check if EMM_W10_pE1 can fire
        if ( (EMM_EMM_W7_mE1 >= 1) &&
                (EMM_EMM_W10_pE1 <= 0))
        {
            if (canFire("EMM_W10_pE1"))
            {
                --EMM_EMM_W7_mE1;
                ++EMM_EMM_W10_pE1;
                fire("EMM_W10_pE1");
                return true;
            }
        }
        //check if EMM_W7_pE2 can fire
        if ( (EMM_geprueft1E2 >= 1) &&
                (EMM_EMM_W7_pE2 <= 0))
        {
            if (canFire("EMM_W7_pE2"))
            {
                --EMM_geprueft1E2;
                ++EMM_EMM_W7_pE2;
                fire("EMM_W7_pE2");
                return true;
            }
        }
        //check if EMM_W10_pE2 can fire
        if ( (EMM_EMM_W7_pE2 >= 1) &&
                (EMM_EMM_W10_pE2 <= 0))
        {
            if (canFire("EMM_W10_pE2"))
            {
                --EMM_EMM_W7_pE2;
                ++EMM_EMM_W10_pE2;
                fire("EMM_W10_pE2");
                return true;
            }
        }
        //check if EMM_W9_pE3 can fire
        if ( (EMM_EMM_W9_pE3 <= 0) &&
                (EMM_geprueft1E3 >= 1))
        {
            if (canFire("EMM_W9_pE3"))
            {
                ++EMM_EMM_W9_pE3;
                --EMM_geprueft1E3;
                fire("EMM_W9_pE3");
                return true;
            }
        }
        //check if EMM_W10_mE3 can fire
        if ( (EMM_EMM_W9_pE3 >= 1) &&
                (EMM_EMM_W10_mE3 <= 0))
        {
            if (canFire("EMM_W10_mE3"))
            {
                --EMM_EMM_W9_pE3;
                ++EMM_EMM_W10_mE3;
                fire("EMM_W10_mE3");
                return true;
            }
        }
        //check if EMM_W8_pE4 can fire
        if ( (EMM_EMM_W8_pE4 <= 0) &&
                (EMM_geprueft1E4 >= 1))
        {
            if (canFire("EMM_W8_pE4"))
            {
                ++EMM_EMM_W8_pE4;
                --EMM_geprueft1E4;
                fire("EMM_W8_pE4");
                return true;
            }
        }
        //check if EMM_w9_mE4 can fire
        if ( (EMM_EMM_W8_pE4 >= 1) &&
                (EMM_EMM_W9_mE4 <= 0))
        {
            if (canFire("EMM_w9_mE4"))
            {
                --EMM_EMM_W8_pE4;
                ++EMM_EMM_W9_mE4;
                fire("EMM_w9_mE4");
                return true;
            }
        }
        //check if EMM_W8_mE5 can fire
        if ( (EMM_geprueft1E5 >= 1) &&
                (EMM_EMM_W8_mE5 <= 0))
        {
            if (canFire("EMM_W8_mE5"))
            {
                --EMM_geprueft1E5;
                ++EMM_EMM_W8_mE5;
                fire("EMM_W8_mE5");
                return true;
            }
        }
        //check if EMM_W9_mE5 can fire
        if ( (EMM_EMM_W9_mE5 <= 0) &&
                (EMM_EMM_W8_mE5 >= 1))
        {
            if (canFire("EMM_W9_mE5"))
            {
                ++EMM_EMM_W9_mE5;
                --EMM_EMM_W8_mE5;
                fire("EMM_W9_mE5");
                return true;
            }
        }
        //check if EMM_Fstr_aufloesen can fire
        if ( (EMM_EMM_W10_mA5 >= 1) &&
                (EMM_EMM_W10_mA4 >= 1) &&
                (EMM_EMM_W10_mA3 >= 1) &&
                (EMM_EMM_W10_pE2 >= 1) &&
                (EMM_EMM_W10_mE3 >= 1) &&
                (EMM_EMM_W10_mE4 >= 1) &&
                (EMM_EMM_W10_mE5 >= 1) &&
                (EMM_EMM_Grundstlg <= 0) &&
                (Iso_cd_belegt >= 1) &&
                (EMM_EMM_W10_pA1 >= 1) &&
                (EMM_EMM_W10_pE1 >= 1) &&
                (EMM_EMM_W10_pA2 >= 1))
        {
            if (canFire("EMM_Fstr_aufloesen"))
            {
                --EMM_EMM_W10_mA5;
                --EMM_EMM_W10_mA4;
                --EMM_EMM_W10_mA3;
                --EMM_EMM_W10_pE2;
                --EMM_EMM_W10_mE3;
                --EMM_EMM_W10_mE4;
                --EMM_EMM_W10_mE5;
                ++EMM_EMM_Grundstlg;
                --EMM_EMM_W10_pA1;
                --EMM_EMM_W10_pE1;
                --EMM_EMM_W10_pA2;
                fire("EMM_Fstr_aufloesen");
                return true;
            }
        }
        //check if EMM_W10_mA4 can fire
        if ( (EMM_EMM_W10_mA4 <= 0) &&
                (EMM_EMM_W9_mA4 >= 1))
        {
            if (canFire("EMM_W10_mA4"))
            {
                ++EMM_EMM_W10_mA4;
                --EMM_EMM_W9_mA4;
                fire("EMM_W10_mA4");
                return true;
            }
        }
        //check if EMM_W10_mA5 can fire
        if ( (EMM_EMM_W9_mA5 >= 1) &&
                (EMM_EMM_W10_mA5 <= 0))
        {
            if (canFire("EMM_W10_mA5"))
            {
                --EMM_EMM_W9_mA5;
                ++EMM_EMM_W10_mA5;
                fire("EMM_W10_mA5");
                return true;
            }
        }
        //check if EMM_W10_mE5 can fire
        if ( (EMM_EMM_W10_mE5 <= 0) &&
                (EMM_EMM_W9_mE5 >= 1))
        {
            if (canFire("EMM_W10_mE5"))
            {
                ++EMM_EMM_W10_mE5;
                --EMM_EMM_W9_mE5;
                fire("EMM_W10_mE5");
                return true;
            }
        }
        //check if EMM_W10_mE4 can fire
        if ( (EMM_EMM_W10_mE4 <= 0) &&
                (EMM_EMM_W9_mE4 >= 1))
        {
            if (canFire("EMM_W10_mE4"))
            {
                ++EMM_EMM_W10_mE4;
                --EMM_EMM_W9_mE4;
                fire("EMM_W10_mE4");
                return true;
            }
        }
        //check if EMM_T25 can fire
        if ( (EMM_C_Halt <= 0) &&
                (EMM_C_Fahrt >= 1) &&
                (Iso_cd_belegt >= 1))
        {
            if (canFire("EMM_T25"))
            {
                ++EMM_C_Halt;
                --EMM_C_Fahrt;
                fire("EMM_T25");
                return true;
            }
        }
        //check if EMM_TC2 can fire
        if ( (EMM_C_FB2 <= 0) &&
                (EMM_C_Fahrt >= 1) &&
                (EMM_EMM_W10_pA1 >= 1) &&
                (EMM_EMM_W10_mA3 >= 1) &&
                (EMM_EMM_W10_mA5 >= 1) &&
                (EMM_EMM_W10_mA4 >= 1))
        {
            if (canFire("EMM_TC2"))
            {
                ++EMM_C_FB2;
                fire("EMM_TC2");
                return true;
            }
        }
        //check if EMM_TC1 can fire
        if ( (EMM_C_FB1 <= 0) &&
                (EMM_C_Fahrt >= 1) &&
                (EMM_EMM_W10_pA2 >= 1))
        {
            if (canFire("EMM_TC1"))
            {
                ++EMM_C_FB1;
                fire("EMM_TC1");
                return true;
            }
        }
        //check if EMM_T24 can fire
        if ( (EMM_C_Halt >= 1) &&
                (EMM_C_Fahrt <= 0) &&
                (EMM_EMM_W10_pA1 >= 1) &&
                (EMM_EMM_W10_mA3 >= 1) &&
                (EMM_EMM_W10_mA4 >= 1) &&
                (EMM_EMM_W10_mA5 >= 1) &&
                (EMM_EMM_W10_pA2 >= 1))
        {
            if (canFire("EMM_T24"))
            {
                --EMM_C_Halt;
                ++EMM_C_Fahrt;
                fire("EMM_T24");
                return true;
            }
        }
        //check if EMM_T125 can fire
        if ( (EMM_D_Fahrt >= 1) &&
                (EMM_D_Halt <= 0) &&
                (Iso_cd_belegt >= 1))
        {
            if (canFire("EMM_T125"))
            {
                --EMM_D_Fahrt;
                ++EMM_D_Halt;
                fire("EMM_T125");
                return true;
            }
        }
        //check if EMM_TD2 can fire
        if ( (EMM_D_Fahrt >= 1) &&
                (EMM_D_FB2 <= 0) &&
                (EMM_EMM_W10_pE1 >= 1) &&
                (EMM_EMM_W10_mE5 >= 1) &&
                (EMM_EMM_W10_mE4 >= 1) &&
                (EMM_EMM_W10_mE3 >= 1))
        {
            if (canFire("EMM_TD2"))
            {
                ++EMM_D_FB2;
                fire("EMM_TD2");
                return true;
            }
        }
        //check if EMM_TD1 can fire
        if ( (EMM_D_Fahrt >= 1) &&
                (EMM_D_FB1 <= 0) &&
                (EMM_EMM_W10_pE2 >= 1))
        {
            if (canFire("EMM_TD1"))
            {
                ++EMM_D_FB1;
                fire("EMM_TD1");
                return true;
            }
        }
        //check if EMM_T124 can fire
        if ( (EMM_D_Halt >= 1) &&
                (EMM_D_Fahrt <= 0) &&
                (EMM_EMM_W10_pE2 >= 1) &&
                (EMM_EMM_W10_mE3 >= 1) &&
                (EMM_EMM_W10_mE4 >= 1) &&
                (EMM_EMM_W10_mE5 >= 1) &&
                (EMM_EMM_W10_pE1 >= 1))
        {
            if (canFire("EMM_T124"))
            {
                --EMM_D_Halt;
                ++EMM_D_Fahrt;
                fire("EMM_T124");
                return true;
            }
        }
        //check if LN_pruefen2A5 can fire
        if ( (LN_geprueft1A5 >= 1) &&
                (BL_OM_LN_Grundstlg_v >= 1) &&
                (LN_geprueft2A5 <= 0))
        {
            if (canFire("LN_pruefen2A5"))
            {
                --LN_geprueft1A5;
                ++LN_geprueft2A5;
                fire("LN_pruefen2A5");
                return true;
            }
        }
        //check if LN_T7 can fire
        if ( (ILTIS_LN_834_2 >= 1) &&
                (LN_EMM_Grundstlg >= 1) &&
                (LN_geprueft1E2 <= 0))
        {
            if (canFire("LN_T7"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E2;
                fire("LN_T7");
                return true;
            }
        }
        //check if LN_T1 can fire
        if ( (ILTIS_LN_1_834 >= 1) &&
                (LN_geprueft1A1 <= 0) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T1"))
            {
                ++LN_geprueft1A1;
                --LN_EMM_Grundstlg;
                fire("LN_T1");
                return true;
            }
        }
        //check if LN_pruefen2A4 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (LN_geprueft1A4 >= 1) &&
                (LN_geprueft2A4 <= 0))
        {
            if (canFire("LN_pruefen2A4"))
            {
                --LN_geprueft1A4;
                ++LN_geprueft2A4;
                fire("LN_pruefen2A4");
                return true;
            }
        }
        //check if LN_T5 can fire
        if ( (ILTIS_LN_5_834 >= 1) &&
                (LN_geprueft1A5 <= 0) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T5"))
            {
                ++LN_geprueft1A5;
                --LN_EMM_Grundstlg;
                fire("LN_T5");
                return true;
            }
        }
        //check if LN_W2_pA2 can fire
        if ( (LN_LN_W1_pA2 >= 1) &&
                (LN_LN_W2_pA2 <= 0))
        {
            if (canFire("LN_W2_pA2"))
            {
                --LN_LN_W1_pA2;
                ++LN_LN_W2_pA2;
                fire("LN_W2_pA2");
                return true;
            }
        }
        //check if LN_T4 can fire
        if ( (LN_geprueft1A4 <= 0) &&
                (ILTIS_LN_4_834 >= 1) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T4"))
            {
                ++LN_geprueft1A4;
                --LN_EMM_Grundstlg;
                fire("LN_T4");
                return true;
            }
        }
        //check if LN_pruefen2A1 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (LN_geprueft1A1 >= 1) &&
                (LN_geprueft2A1 <= 0))
        {
            if (canFire("LN_pruefen2A1"))
            {
                --LN_geprueft1A1;
                ++LN_geprueft2A1;
                fire("LN_pruefen2A1");
                return true;
            }
        }
        //check if LN_W1_pA3 can fire
        if ( (LN_geprueft2A3 >= 1) &&
                (LN_LN_W1_pA3 <= 0))
        {
            if (canFire("LN_W1_pA3"))
            {
                --LN_geprueft2A3;
                ++LN_LN_W1_pA3;
                fire("LN_W1_pA3");
                return true;
            }
        }
        //check if LN_pruefen2A3 can fire
        if ( (LN_geprueft2A3 <= 0) &&
                (LN_geprueft1A3 >= 1) &&
                (BL_OM_LN_Grundstlg_v >= 1))
        {
            if (canFire("LN_pruefen2A3"))
            {
                ++LN_geprueft2A3;
                --LN_geprueft1A3;
                fire("LN_pruefen2A3");
                return true;
            }
        }
        //check if LN_W1_mA1 can fire
        if ( (LN_LN_W1_mA1 <= 0) &&
                (LN_geprueft2A1 >= 1))
        {
            if (canFire("LN_W1_mA1"))
            {
                ++LN_LN_W1_mA1;
                --LN_geprueft2A1;
                fire("LN_W1_mA1");
                return true;
            }
        }
        //check if LN_T9 can fire
        if ( (LN_EMM_Grundstlg >= 1) &&
                (LN_geprueft1E4 <= 0) &&
                (ILTIS_LN_834_4 >= 1))
        {
            if (canFire("LN_T9"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E4;
                fire("LN_T9");
                return true;
            }
        }
        //check if LN_Fstr_aufloesen can fire
        if ( (LN_LN_W6_mA6 >= 1) &&
                (LN_EMM_Grundstlg <= 0) &&
                (LN_ce_belegt >= 1) &&
                (LN_LN_W1_mA1 >= 1) &&
                (LN_LN_W2_pA2 >= 1) &&
                (LN_LN_W5_pA3 >= 1) &&
                (LN_LN_W5_mA4 >= 1) &&
                (LN_LN_W6_mA5 >= 1) &&
                (LN_LN_W6_mE5 >= 1) &&
                (LN_LN_W6_mE6 >= 1) &&
                (LN_LN_W5_mE4 >= 1) &&
                (LN_LN_W5_pE3 >= 1) &&
                (LN_LN_W2_pE2 >= 1) &&
                (LN_LN_W1_mE1 >= 1))
        {
            if (canFire("LN_Fstr_aufloesen"))
            {
                --LN_LN_W6_mA6;
                ++LN_EMM_Grundstlg;
                --LN_LN_W1_mA1;
                --LN_LN_W2_pA2;
                --LN_LN_W5_pA3;
                --LN_LN_W5_mA4;
                --LN_LN_W6_mA5;
                --LN_LN_W6_mE5;
                --LN_LN_W6_mE6;
                --LN_LN_W5_mE4;
                --LN_LN_W5_pE3;
                --LN_LN_W2_pE2;
                --LN_LN_W1_mE1;
                fire("LN_Fstr_aufloesen");
                return true;
            }
        }
        //check if LN_T6 can fire
        if ( (LN_EMM_Grundstlg >= 1) &&
                (ILTIS_LN_834_1 >= 1) &&
                (LN_geprueft1E1 <= 0))
        {
            if (canFire("LN_T6"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E1;
                fire("LN_T6");
                return true;
            }
        }
        //check if LN_T8 can fire
        if ( (LN_EMM_Grundstlg >= 1) &&
                (LN_geprueft1E3 <= 0) &&
                (ILTIS_LN_834_3 >= 1))
        {
            if (canFire("LN_T8"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E3;
                fire("LN_T8");
                return true;
            }
        }
        //check if LN_T10 can fire
        if ( (LN_EMM_Grundstlg >= 1) &&
                (ILTIS_LN_834_5 >= 1) &&
                (LN_geprueft1E5 <= 0))
        {
            if (canFire("LN_T10"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E5;
                fire("LN_T10");
                return true;
            }
        }
        //check if LN_W1_pA2 can fire
        if ( (LN_LN_W1_pA2 <= 0) &&
                (LN_geprueft2A2 >= 1))
        {
            if (canFire("LN_W1_pA2"))
            {
                ++LN_LN_W1_pA2;
                --LN_geprueft2A2;
                fire("LN_W1_pA2");
                return true;
            }
        }
        //check if LN_pruefen2A2 can fire
        if ( (BL_OM_LN_Grundstlg_v >= 1) &&
                (LN_geprueft1A2 >= 1) &&
                (LN_geprueft2A2 <= 0))
        {
            if (canFire("LN_pruefen2A2"))
            {
                --LN_geprueft1A2;
                ++LN_geprueft2A2;
                fire("LN_pruefen2A2");
                return true;
            }
        }
        //check if LN_T2 can fire
        if ( (ILTIS_LN_2_834 >= 1) &&
                (LN_geprueft1A2 <= 0) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T2"))
            {
                ++LN_geprueft1A2;
                --LN_EMM_Grundstlg;
                fire("LN_T2");
                return true;
            }
        }
        //check if LN_T3 can fire
        if ( (LN_geprueft1A3 <= 0) &&
                (ILTIS_LN_3_834 >= 1) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T3"))
            {
                ++LN_geprueft1A3;
                --LN_EMM_Grundstlg;
                fire("LN_T3");
                return true;
            }
        }
        //check if LN_W2_mA3 can fire
        if ( (LN_LN_W1_pA3 >= 1) &&
                (LN_LN_W2_mA3 <= 0))
        {
            if (canFire("LN_W2_mA3"))
            {
                --LN_LN_W1_pA3;
                ++LN_LN_W2_mA3;
                fire("LN_W2_mA3");
                return true;
            }
        }
        //check if LN_W3_pA3 can fire
        if ( (LN_LN_W2_mA3 >= 1) &&
                (LN_LN_W3_pA3 <= 0))
        {
            if (canFire("LN_W3_pA3"))
            {
                --LN_LN_W2_mA3;
                ++LN_LN_W3_pA3;
                fire("LN_W3_pA3");
                return true;
            }
        }
        //check if LN_W3_pA4 can fire
        if ( (LN_LN_W3_pA4 <= 0) &&
                (LN_LN_W2_mA4 >= 1))
        {
            if (canFire("LN_W3_pA4"))
            {
                ++LN_LN_W3_pA4;
                --LN_LN_W2_mA4;
                fire("LN_W3_pA4");
                return true;
            }
        }
        //check if LN_W1_pA4 can fire
        if ( (LN_LN_W1_pA4 <= 0) &&
                (LN_geprueft2A4 >= 1))
        {
            if (canFire("LN_W1_pA4"))
            {
                ++LN_LN_W1_pA4;
                --LN_geprueft2A4;
                fire("LN_W1_pA4");
                return true;
            }
        }
        //check if LN_W2_mA4 can fire
        if ( (LN_LN_W1_pA4 >= 1) &&
                (LN_LN_W2_mA4 <= 0))
        {
            if (canFire("LN_W2_mA4"))
            {
                --LN_LN_W1_pA4;
                ++LN_LN_W2_mA4;
                fire("LN_W2_mA4");
                return true;
            }
        }
        //check if LN_W5_pA3 can fire
        if ( (LN_LN_W5_pA3 <= 0) &&
                (LN_LN_W3_pA3 >= 1))
        {
            if (canFire("LN_W5_pA3"))
            {
                ++LN_LN_W5_pA3;
                --LN_LN_W3_pA3;
                fire("LN_W5_pA3");
                return true;
            }
        }
        //check if LN_W5_mA4 can fire
        if ( (LN_LN_W5_mA4 <= 0) &&
                (LN_LN_W3_pA4 >= 1))
        {
            if (canFire("LN_W5_mA4"))
            {
                ++LN_LN_W5_mA4;
                --LN_LN_W3_pA4;
                fire("LN_W5_mA4");
                return true;
            }
        }
        //check if LN_W2_mA5 can fire
        if ( (LN_LN_W2_mA5 <= 0) &&
                (LN_LN_W1_pA5 >= 1))
        {
            if (canFire("LN_W2_mA5"))
            {
                ++LN_LN_W2_mA5;
                --LN_LN_W1_pA5;
                fire("LN_W2_mA5");
                return true;
            }
        }
        //check if LN_W3_mA5 can fire
        if ( (LN_LN_W2_mA5 >= 1) &&
                (LN_LN_W3_mA5 <= 0))
        {
            if (canFire("LN_W3_mA5"))
            {
                --LN_LN_W2_mA5;
                ++LN_LN_W3_mA5;
                fire("LN_W3_mA5");
                return true;
            }
        }
        //check if LN_W1_pA5 can fire
        if ( (LN_LN_W1_pA5 <= 0) &&
                (LN_geprueft2A5 >= 1))
        {
            if (canFire("LN_W1_pA5"))
            {
                ++LN_LN_W1_pA5;
                --LN_geprueft2A5;
                fire("LN_W1_pA5");
                return true;
            }
        }
        //check if LN_W4_pA5 can fire
        if ( (LN_LN_W3_mA5 >= 1) &&
                (LN_LN_W4_pA5 <= 0))
        {
            if (canFire("LN_W4_pA5"))
            {
                --LN_LN_W3_mA5;
                ++LN_LN_W4_pA5;
                fire("LN_W4_pA5");
                return true;
            }
        }
        //check if LN_W6_mA5 can fire
        if ( (LN_LN_W4_pA5 >= 1) &&
                (LN_LN_W6_mA5 <= 0))
        {
            if (canFire("LN_W6_mA5"))
            {
                --LN_LN_W4_pA5;
                ++LN_LN_W6_mA5;
                fire("LN_W6_mA5");
                return true;
            }
        }
        //check if LN_W2_mA6 can fire
        if ( (LN_LN_W1_pA6 >= 1) &&
                (LN_LN_W2_mA6 <= 0))
        {
            if (canFire("LN_W2_mA6"))
            {
                --LN_LN_W1_pA6;
                ++LN_LN_W2_mA6;
                fire("LN_W2_mA6");
                return true;
            }
        }
        //check if LN_W6_mA6 can fire
        if ( (LN_LN_W4_pA6 >= 1) &&
                (LN_LN_W6_mA6 <= 0))
        {
            if (canFire("LN_W6_mA6"))
            {
                --LN_LN_W4_pA6;
                ++LN_LN_W6_mA6;
                fire("LN_W6_mA6");
                return true;
            }
        }
        //check if LN_W4_pA6 can fire
        if ( (LN_LN_W4_pA6 <= 0) &&
                (LN_LN_W3_mA6 >= 1))
        {
            if (canFire("LN_W4_pA6"))
            {
                ++LN_LN_W4_pA6;
                --LN_LN_W3_mA6;
                fire("LN_W4_pA6");
                return true;
            }
        }
        //check if LN_W1_pA6 can fire
        if ( (LN_geprueft2A6 >= 1) &&
                (LN_LN_W1_pA6 <= 0))
        {
            if (canFire("LN_W1_pA6"))
            {
                --LN_geprueft2A6;
                ++LN_LN_W1_pA6;
                fire("LN_W1_pA6");
                return true;
            }
        }
        //check if LN_W3_mA6 can fire
        if ( (LN_LN_W2_mA6 >= 1) &&
                (LN_LN_W3_mA6 <= 0))
        {
            if (canFire("LN_W3_mA6"))
            {
                --LN_LN_W2_mA6;
                ++LN_LN_W3_mA6;
                fire("LN_W3_mA6");
                return true;
            }
        }
        //check if LN_pruefen2A6 can fire
        if ( (LN_geprueft1A6 >= 1) &&
                (LN_geprueft2A6 <= 0) &&
                (BL_OM_LN_Grundstlg_v >= 1))
        {
            if (canFire("LN_pruefen2A6"))
            {
                --LN_geprueft1A6;
                ++LN_geprueft2A6;
                fire("LN_pruefen2A6");
                return true;
            }
        }
        //check if LN_T105 can fire
        if ( (ILTIS_LN_6_834 >= 1) &&
                (LN_geprueft1A6 <= 0) &&
                (LN_EMM_Grundstlg >= 1))
        {
            if (canFire("LN_T105"))
            {
                ++LN_geprueft1A6;
                --LN_EMM_Grundstlg;
                fire("LN_T105");
                return true;
            }
        }
        //check if LN_W2_mE6 can fire
        if ( (LN_LN_W1_pE6 >= 1) &&
                (LN_LN_W2_mE6 <= 0))
        {
            if (canFire("LN_W2_mE6"))
            {
                --LN_LN_W1_pE6;
                ++LN_LN_W2_mE6;
                fire("LN_W2_mE6");
                return true;
            }
        }
        //check if LN_W3_pE4 can fire
        if ( (LN_LN_W3_pE4 <= 0) &&
                (LN_LN_W2_mE4 >= 1))
        {
            if (canFire("LN_W3_pE4"))
            {
                ++LN_LN_W3_pE4;
                --LN_LN_W2_mE4;
                fire("LN_W3_pE4");
                return true;
            }
        }
        //check if LN_W1_mE1 can fire
        if ( (LN_geprueft1E1 >= 1) &&
                (LN_LN_W1_mE1 <= 0))
        {
            if (canFire("LN_W1_mE1"))
            {
                --LN_geprueft1E1;
                ++LN_LN_W1_mE1;
                fire("LN_W1_mE1");
                return true;
            }
        }
        //check if LN_W1_pE6 can fire
        if ( (LN_geprueft1E6 >= 1) &&
                (LN_LN_W1_pE6 <= 0))
        {
            if (canFire("LN_W1_pE6"))
            {
                --LN_geprueft1E6;
                ++LN_LN_W1_pE6;
                fire("LN_W1_pE6");
                return true;
            }
        }
        //check if LN_W3_mE6 can fire
        if ( (LN_LN_W3_mE6 <= 0) &&
                (LN_LN_W2_mE6 >= 1))
        {
            if (canFire("LN_W3_mE6"))
            {
                ++LN_LN_W3_mE6;
                --LN_LN_W2_mE6;
                fire("LN_W3_mE6");
                return true;
            }
        }
        //check if LN_W6_mE6 can fire
        if ( (LN_LN_W6_mE6 <= 0) &&
                (LN_LN_W4_pE6 >= 1))
        {
            if (canFire("LN_W6_mE6"))
            {
                ++LN_LN_W6_mE6;
                --LN_LN_W4_pE6;
                fire("LN_W6_mE6");
                return true;
            }
        }
        //check if LN_W3_pE3 can fire
        if ( (LN_LN_W2_mE3 >= 1) &&
                (LN_LN_W3_pE3 <= 0))
        {
            if (canFire("LN_W3_pE3"))
            {
                --LN_LN_W2_mE3;
                ++LN_LN_W3_pE3;
                fire("LN_W3_pE3");
                return true;
            }
        }
        //check if LN_W4_pE6 can fire
        if ( (LN_LN_W3_mE6 >= 1) &&
                (LN_LN_W4_pE6 <= 0))
        {
            if (canFire("LN_W4_pE6"))
            {
                --LN_LN_W3_mE6;
                ++LN_LN_W4_pE6;
                fire("LN_W4_pE6");
                return true;
            }
        }
        //check if LN_W2_mE4 can fire
        if ( (LN_LN_W1_pE4 >= 1) &&
                (LN_LN_W2_mE4 <= 0))
        {
            if (canFire("LN_W2_mE4"))
            {
                --LN_LN_W1_pE4;
                ++LN_LN_W2_mE4;
                fire("LN_W2_mE4");
                return true;
            }
        }
        //check if LN_W1_pE3 can fire
        if ( (LN_geprueft1E3 >= 1) &&
                (LN_LN_W1_pE3 <= 0))
        {
            if (canFire("LN_W1_pE3"))
            {
                --LN_geprueft1E3;
                ++LN_LN_W1_pE3;
                fire("LN_W1_pE3");
                return true;
            }
        }
        //check if LN_W1_pE2 can fire
        if ( (LN_geprueft1E2 >= 1) &&
                (LN_LN_W1_pE2 <= 0))
        {
            if (canFire("LN_W1_pE2"))
            {
                --LN_geprueft1E2;
                ++LN_LN_W1_pE2;
                fire("LN_W1_pE2");
                return true;
            }
        }
        //check if LN_W3_mE5 can fire
        if ( (LN_LN_W2_mE5 >= 1) &&
                (LN_LN_W3_mE5 <= 0))
        {
            if (canFire("LN_W3_mE5"))
            {
                --LN_LN_W2_mE5;
                ++LN_LN_W3_mE5;
                fire("LN_W3_mE5");
                return true;
            }
        }
        //check if LN_W2_mE3 can fire
        if ( (LN_LN_W2_mE3 <= 0) &&
                (LN_LN_W1_pE3 >= 1))
        {
            if (canFire("LN_W2_mE3"))
            {
                ++LN_LN_W2_mE3;
                --LN_LN_W1_pE3;
                fire("LN_W2_mE3");
                return true;
            }
        }
        //check if LN_W1_pE5 can fire
        if ( (LN_LN_W1_pE5 <= 0) &&
                (LN_geprueft1E5 >= 1))
        {
            if (canFire("LN_W1_pE5"))
            {
                ++LN_LN_W1_pE5;
                --LN_geprueft1E5;
                fire("LN_W1_pE5");
                return true;
            }
        }
        //check if LN_W6_mE5 can fire
        if ( (LN_LN_W6_mE5 <= 0) &&
                (LN_LN_W4_pE5 >= 1))
        {
            if (canFire("LN_W6_mE5"))
            {
                ++LN_LN_W6_mE5;
                --LN_LN_W4_pE5;
                fire("LN_W6_mE5");
                return true;
            }
        }
        //check if LN_W4_pE5 can fire
        if ( (LN_LN_W4_pE5 <= 0) &&
                (LN_LN_W3_mE5 >= 1))
        {
            if (canFire("LN_W4_pE5"))
            {
                ++LN_LN_W4_pE5;
                --LN_LN_W3_mE5;
                fire("LN_W4_pE5");
                return true;
            }
        }
        //check if LN_W1_pE4 can fire
        if ( (LN_LN_W1_pE4 <= 0) &&
                (LN_geprueft1E4 >= 1))
        {
            if (canFire("LN_W1_pE4"))
            {
                ++LN_LN_W1_pE4;
                --LN_geprueft1E4;
                fire("LN_W1_pE4");
                return true;
            }
        }
        //check if LN_W5_mE4 can fire
        if ( (LN_LN_W5_mE4 <= 0) &&
                (LN_LN_W3_pE4 >= 1))
        {
            if (canFire("LN_W5_mE4"))
            {
                ++LN_LN_W5_mE4;
                --LN_LN_W3_pE4;
                fire("LN_W5_mE4");
                return true;
            }
        }
        //check if LN_W2_pE2 can fire
        if ( (LN_LN_W2_pE2 <= 0) &&
                (LN_LN_W1_pE2 >= 1))
        {
            if (canFire("LN_W2_pE2"))
            {
                ++LN_LN_W2_pE2;
                --LN_LN_W1_pE2;
                fire("LN_W2_pE2");
                return true;
            }
        }
        //check if LN_W5_pE3 can fire
        if ( (LN_LN_W5_pE3 <= 0) &&
                (LN_LN_W3_pE3 >= 1))
        {
            if (canFire("LN_W5_pE3"))
            {
                ++LN_LN_W5_pE3;
                --LN_LN_W3_pE3;
                fire("LN_W5_pE3");
                return true;
            }
        }
        //check if LN_W2_mE5 can fire
        if ( (LN_LN_W2_mE5 <= 0) &&
                (LN_LN_W1_pE5 >= 1))
        {
            if (canFire("LN_W2_mE5"))
            {
                ++LN_LN_W2_mE5;
                --LN_LN_W1_pE5;
                fire("LN_W2_mE5");
                return true;
            }
        }
        //check if LN_T110 can fire
        if ( (LN_EMM_Grundstlg >= 1) &&
                (LN_geprueft1E6 <= 0) &&
                (ILTIS_LN_834_6 >= 1))
        {
            if (canFire("LN_T110"))
            {
                --LN_EMM_Grundstlg;
                ++LN_geprueft1E6;
                fire("LN_T110");
                return true;
            }
        }
        //check if LN_T125 can fire
        if ( (LN_C1_Halt <= 0) &&
                (LN_C1_Fahrt2 >= 1) &&
                (LN_ce_belegt >= 1))
        {
            if (canFire("LN_T125"))
            {
                ++LN_C1_Halt;
                --LN_C1_Fahrt2;
                fire("LN_T125");
                return true;
            }
        }
        //check if LN_T124 can fire
        if ( (LN_C1_Halt >= 1) &&
                (LN_C1_Fahrt2 <= 0) &&
                (LN_LN_W1_mA1 >= 1))
        {
            if (canFire("LN_T124"))
            {
                --LN_C1_Halt;
                ++LN_C1_Fahrt2;
                fire("LN_T124");
                return true;
            }
        }
        //check if LN_T225 can fire
        if ( (LN_C26_Fahrt >= 1) &&
                (LN_C26_Halt <= 0) &&
                (LN_ce_belegt >= 1))
        {
            if (canFire("LN_T225"))
            {
                --LN_C26_Fahrt;
                ++LN_C26_Halt;
                fire("LN_T225");
                return true;
            }
        }
        //check if LN_TC2 can fire
        if ( (LN_C26_Fahrt >= 1) &&
                (LN_C26_FB2 <= 0) &&
                (LN_LN_W6_mA6 >= 1) &&
                (LN_LN_W6_mA5 >= 1) &&
                (LN_LN_W5_mA4 >= 1) &&
                (LN_LN_W5_pA3 >= 1))
        {
            if (canFire("LN_TC2"))
            {
                ++LN_C26_FB2;
                fire("LN_TC2");
                return true;
            }
        }
        //check if LN_TC1 can fire
        if ( (LN_C26_Fahrt >= 1) &&
                (LN_C26_FB1 <= 0) &&
                (LN_LN_W2_pA2 >= 1))
        {
            if (canFire("LN_TC1"))
            {
                ++LN_C26_FB1;
                fire("LN_TC1");
                return true;
            }
        }
        //check if LN_T224 can fire
        if ( (LN_C26_Halt >= 1) &&
                (LN_C26_Fahrt <= 0) &&
                (LN_LN_W2_pA2 >= 1) &&
                (LN_LN_W5_pA3 >= 1) &&
                (LN_LN_W5_mA4 >= 1) &&
                (LN_LN_W6_mA5 >= 1) &&
                (LN_LN_W6_mA6 >= 1))
        {
            if (canFire("LN_T224"))
            {
                --LN_C26_Halt;
                ++LN_C26_Fahrt;
                fire("LN_T224");
                return true;
            }
        }
        //check if LN_T325 can fire
        if ( (LN_E_Fahrt >= 1) &&
                (LN_e_Halt <= 0))
        {
            if (canFire("LN_T325"))
            {
                --LN_E_Fahrt;
                ++LN_e_Halt;
                fire("LN_T325");
                return true;
            }
        }
        //check if LN_TD2 can fire
        if ( (LN_E_Fahrt >= 1) &&
                (LN_E_FB2 <= 0) &&
                (LN_LN_W6_mE6 >= 1) &&
                (LN_LN_W6_mE5 >= 1) &&
                (LN_LN_W5_mE4 >= 1) &&
                (LN_LN_W5_pE3 >= 1) &&
                (LN_LN_W1_mE1 >= 1))
        {
            if (canFire("LN_TD2"))
            {
                --LN_E_Fahrt;
                ++LN_E_FB2;
                fire("LN_TD2");
                return true;
            }
        }
        //check if LN_TD1 can fire
        if ( (LN_E_Fahrt >= 1) &&
                (LN_E_FB1 <= 0) &&
                (LN_LN_W2_pE2 >= 1))
        {
            if (canFire("LN_TD1"))
            {
                ++LN_E_FB1;
                fire("LN_TD1");
                return true;
            }
        }
        //check if LN_T324 can fire
        if ( (LN_e_Halt >= 1) &&
                (LN_E_Fahrt <= 0) &&
                (LN_LN_W1_mE1 >= 1) &&
                (LN_LN_W2_pE2 >= 1) &&
                (LN_LN_W6_mE5 >= 1) &&
                (LN_LN_W5_pE3 >= 1) &&
                (LN_LN_W6_mE6 >= 1) &&
                (LN_LN_W5_mE4 >= 1))
        {
            if (canFire("LN_T324"))
            {
                --LN_e_Halt;
                ++LN_E_Fahrt;
                fire("LN_T324");
                return true;
            }
        }
        //check if ZB_T7 can fire
        if ( (ILTIS_ZB_138_2 >= 1) &&
                (ZB_geprueft1E2 <= 0) &&
                (ZB_EMM_Grundstlg >= 1))
        {
            if (canFire("ZB_T7"))
            {
                ++ZB_geprueft1E2;
                --ZB_EMM_Grundstlg;
                fire("ZB_T7");
                return true;
            }
        }
        //check if ZB_T225 can fire
        if ( (ZB_D_Halt <= 0) &&
                (ZB_D_Fahrt >= 1) &&
                (ZB_cd_belegt >= 1))
        {
            if (canFire("ZB_T225"))
            {
                ++ZB_D_Halt;
                --ZB_D_Fahrt;
                fire("ZB_T225");
                return true;
            }
        }
        //check if ZB_T1 can fire
        if ( (ILTIS_ZB_1_138 >= 1) &&
                (ZB_geprueft1A1 <= 0) &&
                (ZB_EMM_Grundstlg >= 1))
        {
            if (canFire("ZB_T1"))
            {
                ++ZB_geprueft1A1;
                --ZB_EMM_Grundstlg;
                fire("ZB_T1");
                return true;
            }
        }
        //check if ZB_W2_mE2 can fire
        if ( (ZB_ZB_W2_pE2 <= 0) &&
                (ZB_geprueft1E2 >= 1))
        {
            if (canFire("ZB_W2_mE2"))
            {
                ++ZB_ZB_W2_pE2;
                --ZB_geprueft1E2;
                fire("ZB_W2_mE2");
                return true;
            }
        }
        //check if ZB_pruefen2A1 can fire
        if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
                (ZB_geprueft1A1 >= 1) &&
                (ZB_geprueft2A1 <= 0))
        {
            if (canFire("ZB_pruefen2A1"))
            {
                --ZB_geprueft1A1;
                ++ZB_geprueft2A1;
                fire("ZB_pruefen2A1");
                return true;
            }
        }
        //check if ZB_W2_mA1 can fire
        if ( (ZB_ZB_W2_mA1 <= 0) &&
                (ZB_geprueft2A1 >= 1))
        {
            if (canFire("ZB_W2_mA1"))
            {
                ++ZB_ZB_W2_mA1;
                --ZB_geprueft2A1;
                fire("ZB_W2_mA1");
                return true;
            }
        }
        //check if ZB_Fstr_aufloesen can fire
        if ( (ZB_ZB_W1_pE2 >= 1) &&
                (ZB_ZB_W1_mE1 >= 1) &&
                (ZB_EMM_Grundstlg <= 0) &&
                (ZB_ZB_W1_pA2 >= 1) &&
                (ZB_ZB_W1_mA1 >= 1) &&
                (ZB_cd_belegt >= 1))
        {
            if (canFire("ZB_Fstr_aufloesen"))
            {
                --ZB_ZB_W1_pE2;
                --ZB_ZB_W1_mE1;
                ++ZB_EMM_Grundstlg;
                --ZB_ZB_W1_pA2;
                --ZB_ZB_W1_mA1;
                fire("ZB_Fstr_aufloesen");
                return true;
            }
        }
        //check if ZB_W2_mE1 can fire
        if ( (ZB_ZB_W2_mE1 <= 0) &&
                (ZB_geprueft1E1 >= 1))
        {
            if (canFire("ZB_W2_mE1"))
            {
                ++ZB_ZB_W2_mE1;
                --ZB_geprueft1E1;
                fire("ZB_W2_mE1");
                return true;
            }
        }
        //check if ZB_T125 can fire
        if ( (ZB_C_Halt <= 0) &&
                (ZB_cd_belegt >= 1) &&
                (ZB_C_Fahrt >= 1))
        {
            if (canFire("ZB_T125"))
            {
                ++ZB_C_Halt;
                --ZB_C_Fahrt;
                fire("ZB_T125");
                return true;
            }
        }
        //check if ZB_T6 can fire
        if ( (ILTIS_ZB_138_1 >= 1) &&
                (ZB_geprueft1E1 <= 0) &&
                (ZB_EMM_Grundstlg >= 1))
        {
            if (canFire("ZB_T6"))
            {
                ++ZB_geprueft1E1;
                --ZB_EMM_Grundstlg;
                fire("ZB_T6");
                return true;
            }
        }
        //check if ZB_W2_pA2 can fire
        if ( (ZB_ZB_W2_pA2 <= 0) &&
                (ZB_geprueft2A2 >= 1))
        {
            if (canFire("ZB_W2_pA2"))
            {
                ++ZB_ZB_W2_pA2;
                --ZB_geprueft2A2;
                fire("ZB_W2_pA2");
                return true;
            }
        }
        //check if ZB_pruefen2A2 can fire
        if ( (BL_ZB_OM_Grundstlg_v >= 1) &&
                (ZB_geprueft1A2 >= 1) &&
                (ZB_geprueft2A2 <= 0))
        {
            if (canFire("ZB_pruefen2A2"))
            {
                --ZB_geprueft1A2;
                ++ZB_geprueft2A2;
                fire("ZB_pruefen2A2");
                return true;
            }
        }
        //check if ZB_T2 can fire
        if ( (ILTIS_ZB_2_138 >= 1) &&
                (ZB_geprueft1A2 <= 0) &&
                (ZB_EMM_Grundstlg >= 1))
        {
            if (canFire("ZB_T2"))
            {
                ++ZB_geprueft1A2;
                --ZB_EMM_Grundstlg;
                fire("ZB_T2");
                return true;
            }
        }
        //check if ZB_T224 can fire
        if ( (ZB_D_Halt >= 1) &&
                (ZB_ZB_W1_mE1 >= 1) &&
                (ZB_ZB_W1_pE2 >= 1) &&
                (ZB_D_Fahrt <= 0))
        {
            if (canFire("ZB_T224"))
            {
                --ZB_D_Halt;
                ++ZB_D_Fahrt;
                fire("ZB_T224");
                return true;
            }
        }
        //check if ZB_T124 can fire
        if ( (ZB_C_Halt >= 1) &&
                (ZB_ZB_W1_mA1 >= 1) &&
                (ZB_ZB_W1_pA2 >= 1) &&
                (ZB_C_Fahrt <= 0))
        {
            if (canFire("ZB_T124"))
            {
                --ZB_C_Halt;
                ++ZB_C_Fahrt;
                fire("ZB_T124");
                return true;
            }
        }
        //check if ZB_W1_mE2 can fire
        if ( (ZB_ZB_W1_pE2 <= 0) &&
                (ZB_ZB_W2_pE2 >= 1))
        {
            if (canFire("ZB_W1_mE2"))
            {
                ++ZB_ZB_W1_pE2;
                --ZB_ZB_W2_pE2;
                fire("ZB_W1_mE2");
                return true;
            }
        }
        //check if ZB_W1_mE1 can fire
        if ( (ZB_ZB_W1_mE1 <= 0) &&
                (ZB_ZB_W2_mE1 >= 1))
        {
            if (canFire("ZB_W1_mE1"))
            {
                ++ZB_ZB_W1_mE1;
                --ZB_ZB_W2_mE1;
                fire("ZB_W1_mE1");
                return true;
            }
        }
        //check if ZB_W1_mA2 can fire
        if ( (ZB_ZB_W1_pA2 <= 0) &&
                (ZB_ZB_W2_pA2 >= 1))
        {
            if (canFire("ZB_W1_mA2"))
            {
                ++ZB_ZB_W1_pA2;
                --ZB_ZB_W2_pA2;
                fire("ZB_W1_mA2");
                return true;
            }
        }
        //check if ZB_W1_mA1 can fire
        if ( (ZB_ZB_W2_mA1 >= 1) &&
                (ZB_ZB_W1_mA1 <= 0))
        {
            if (canFire("ZB_W1_mA1"))
            {
                --ZB_ZB_W2_mA1;
                ++ZB_ZB_W1_mA1;
                fire("ZB_W1_mA1");
                return true;
            }
        }
        //check if ZB_TC1 can fire
        if ( (ZB_C_Fahrt >= 1) &&
                (ZB_C_FB1 <= 0) &&
                (ZB_ZB_W1_pA2 >= 1))
        {
            if (canFire("ZB_TC1"))
            {
                ++ZB_C_FB1;
                fire("ZB_TC1");
                return true;
            }
        }
        //check if ZB_TC2 can fire
        if ( (ZB_C_FB2 <= 0) &&
                (ZB_C_Fahrt >= 1) &&
                (ZB_ZB_W1_mA1 >= 1))
        {
            if (canFire("ZB_TC2"))
            {
                ++ZB_C_FB2;
                fire("ZB_TC2");
                return true;
            }
        }
        //check if ZB_TD3 can fire
        if ( (ZB_D_Fahrt >= 1) &&
                (ZB_D_FB1 <= 0) &&
                (ZB_ZB_W1_pE2 >= 1))
        {
            if (canFire("ZB_TD3"))
            {
                ++ZB_D_FB1;
                fire("ZB_TD3");
                return true;
            }
        }
        //check if ZB_TD4 can fire
        if ( (ZB_D_Fahrt >= 1) &&
                (ZB_D_FB2 <= 0) &&
                (ZB_ZB_W1_mE1 >= 1))
        {
            if (canFire("ZB_TD4"))
            {
                ++ZB_D_FB2;
                fire("ZB_TD4");
                return true;
            }
        }
        //check if ILTIS_T201 can fire
        if ( (ILTIS_festgehalten_vLN >= 1) &&
                (ILTIS_freigegeben_vLN <= 0) &&
                (ILTIS_freigeben_vLN >= 1))
        {
            if (canFire("ILTIS_T201"))
            {
                --ILTIS_festgehalten_vLN;
                ++ILTIS_freigegeben_vLN;
                fire("ILTIS_T201");
                return true;
            }
        }
        //check if ILTIS_T202 can fire
        if ( (ILTIS_festgehalten_vLN <= 0) &&
                (ILTIS_freigegeben_vLN >= 1) &&
                (ILTIS_festhalten_vLN >= 1))
        {
            if (canFire("ILTIS_T202"))
            {
                ++ILTIS_festgehalten_vLN;
                --ILTIS_freigegeben_vLN;
                fire("ILTIS_T202");
                return true;
            }
        }
        //check if ILTIS_T101 can fire
        if ( (ILTIS_freigegeben_vZB <= 0) &&
                (ILTIS_freigeben_vZB >= 1) &&
                (ILTIS_festgehalten_v_ZB >= 1))
        {
            if (canFire("ILTIS_T101"))
            {
                ++ILTIS_freigegeben_vZB;
                --ILTIS_festgehalten_v_ZB;
                fire("ILTIS_T101");
                return true;
            }
        }
        //check if ILTIS_T102 can fire
        if ( (ILTIS_freigegeben_vZB >= 1) &&
                (ILTIS_festgehalten_v_ZB <= 0) &&
                (ILTIS_festhalten_vZB >= 1))
        {
            if (canFire("ILTIS_T102"))
            {
                --ILTIS_freigegeben_vZB;
                ++ILTIS_festgehalten_v_ZB;
                fire("ILTIS_T102");
                return true;
            }
        }
        //check if ILTIS_T203 can fire
        if ( (ILTIS_RM_moeglich2 <= 0) &&
                (ILTIS_P230 >= 1))
        {
            if (canFire("ILTIS_T203"))
            {
                ++ILTIS_RM_moeglich2;
                --ILTIS_P230;
                fire("ILTIS_T203");
                return true;
            }
        }
        //check if ILTIS_T204 can fire
        if ( (ILTIS_RM_moeglich2 >= 1) &&
                (ILTIS_P230 <= 0))
        {
            if (canFire("ILTIS_T204"))
            {
                --ILTIS_RM_moeglich2;
                ++ILTIS_P230;
                fire("ILTIS_T204");
                return true;
            }
        }
        //check if ILTIS_T205 can fire
        if ( (ILTIS_RM_moeglich2 >= 1) &&
                (ILTIS_rueckmelden_LN_OM >= 1) &&
                (ILTIS_RM_LN_OM <= 0))
        {
            if (canFire("ILTIS_T205"))
            {
                ++ILTIS_RM_LN_OM;
                fire("ILTIS_T205");
                return true;
            }
        }
        //check if ILTIS_T103 can fire
        if ( (ILTIS_RM_moeglich1 <= 0) &&
                (ILTIS_P130 >= 1))
        {
            if (canFire("ILTIS_T103"))
            {
                ++ILTIS_RM_moeglich1;
                --ILTIS_P130;
                fire("ILTIS_T103");
                return true;
            }
        }
        //check if ILTIS_T104 can fire
        if ( (ILTIS_RM_moeglich1 >= 1) &&
                (ILTIS_P130 <= 0))
        {
            if (canFire("ILTIS_T104"))
            {
                --ILTIS_RM_moeglich1;
                ++ILTIS_P130;
                fire("ILTIS_T104");
                return true;
            }
        }
        //check if ILTIS_T105 can fire
        if ( (ILTIS_RM_moeglich1 >= 1) &&
                (ILTIS_RM_ZB_OM <= 0) &&
                (ILTIS_rueckmelden_ZB_OM >= 1))
        {
            if (canFire("ILTIS_T105"))
            {
                ++ILTIS_RM_ZB_OM;
                fire("ILTIS_T105");
                return true;
            }
        }
        return false;
    }
}