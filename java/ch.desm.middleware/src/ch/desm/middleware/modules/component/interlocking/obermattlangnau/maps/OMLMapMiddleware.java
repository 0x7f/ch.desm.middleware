package ch.desm.middleware.modules.component.interlocking.obermattlangnau.maps;

import java.util.Map;

import ch.desm.middleware.modules.component.ComponentMapBase;

public class OMLMapMiddleware extends ComponentMapBase{

	@Override
	public Map<String, String> getMap() {
		return map;
	}
	
	@Override
	protected void initialize(){
		
		map.put("1.90.01", "1.90.01;;0;lampe;signalfstern;gestört;?;stellwerkobermattlangnau;#");
		map.put("1.90.02", "1.90.02;o;0;lampe;signalf;notrot;?;stellwerkobermattlangnau;#");
		map.put("1.90.03", "1.90.03;o;0;lampe;signalf;grün_fb3;?;stellwerkobermattlangnau;#");
		map.put("1.90.04", "1.90.04;o;0;lampe;signalf;rot;?;stellwerkobermattlangnau;#");
		map.put("1.90.05", "1.90.05;o;0;lampe;signalf;grün_fb1;?;stellwerkobermattlangnau;#");
		map.put("1.90.06", "1.90.06;o;0;lampe;signale;grün_fb1;?;stellwerkobermattlangnau;#");
		map.put("1.90.07", "1.90.07;o;0;lampe;signale;rot;?;stellwerkobermattlangnau;#");
		map.put("1.90.08", "1.90.08;o;0;lampe;signale;notrot;?;stellwerkobermattlangnau;#");
		map.put("1.90.09", "1.90.09;o;0;lampe;signalg;grün_fb1;?;stellwerkobermattlangnau;#");
		map.put("1.90.10", "1.90.10;o;0;lampe;signalg;rot;?;stellwerkobermattlangnau;#");
		map.put("1.90.11", "1.90.11;o;0;lampe;signalg;grün_fb3;?;stellwerkobermattlangnau;#");
		map.put("1.90.12", "1.90.12;o;0;lampe;signald;rot;?;stellwerkobermattlangnau;#");
		map.put("1.90.13", "1.90.13;o;0;lampe;signald;grün;?;stellwerkobermattlangnau;#");
		map.put("1.90.14", "1.90.14;o;0;lampe;signalc;grün;?;stellwerkobermattlangnau;#");
		map.put("1.90.15", "1.90.15;o;0;lampe;signalc;rot;?;stellwerkobermattlangnau;#");
		map.put("1.90.16", "1.90.16;o;0;lampe;signalgstern;gestört;?;stellwerkobermattlangnau;#");
		map.put("1.91.21", "1.91.21;o;0;lampe;fbv;von_zb;?;stellwerkobermattlangnau;#");
		map.put("1.91.22", "1.91.22;o;0;lampe;rm_möglich;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("1.90.31", "1.90.31;o;0;lampe;block_rot;von_ln;?;stellwerkobermattlangnau;#");
		map.put("1.90.32", "1.90.32;o;0;lampe;block_weiss;von_ln;?;stellwerkobermattlangnau;#");
		map.put("1.90.33", "1.90.33;o;0;lampe;block_weiss;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("1.90.34", "1.90.34;o;0;lampe;block_rot;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("1.90.35", "1.90.35;o;0;lampe;isolierung;egf;?;stellwerkobermattlangnau;#");
		map.put("1.90.36", "1.90.36;o;0;lampe;isolierung;1;?;stellwerkobermattlangnau;#");
		map.put("1.90.37", "1.90.37;o;0;lampe;fahrstrasse;ef;?;stellwerkobermattlangnau;#");
		map.put("1.90.38", "1.90.38;o;0;lampe;isolierung;ef;?;stellwerkobermattlangnau;#");
		map.put("1.90.39", "1.90.39;o;0;lampe;isolierung;cd;?;stellwerkobermattlangnau;#");
		map.put("1.90.40", "1.90.40;o;0;lampe;fahrstrasse;gf;?;stellwerkobermattlangnau;#");
		map.put("1.90.41", "1.90.41;o;0;lampe;block_rot;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("1.90.42", "1.90.42;o;0;lampe;block_weiss;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("1.90.43", "1.90.43;o;0;lampe;block_weiss;von_zb;?;stellwerkobermattlangnau;#");
		map.put("1.90.44", "1.90.44;o;0;lampe;block_rot;von_zb;?;stellwerkobermattlangnau;#");
		map.put("1.91.01", "1.91.01;o;0;lampe;rm_möglich;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("1.91.02", "1.91.02;o;0;lampe;fbv;von_ln;?;stellwerkobermattlangnau;#");
		map.put("1.91.03", "1.91.03;o;0;lampe;wecker;abschalten;?;stellwerkobermattlangnau;#");
		map.put("1.01.01", "1.01.01;o;0;lampe;ws1;freigabe;?;stellwerkobermattlangnau;#");
		map.put("1.01.02", "1.01.02;o;0;lampe;ws1;überwachung;?;stellwerkobermattlangnau;#");
		map.put("1.04.01", "1.04.01;;0;lampe;fssegf;sperre;?;stellwerkobermattlangnau;#");
		map.put("1.04.02", "1.04.02;;0;lampe;fssegf;kuppelstrom;?;stellwerkobermattlangnau;#");
		map.put("2.92.01", "2.92.01;o;0;wecker;weichen;wecker;?;stellwerkobermattlangnau;#");
		map.put("2.92.02", "2.92.02;o;0;wecker;block;wecker;?;stellwerkobermattlangnau;#");
		map.put("2.90.01", "2.90.01;o;0;wecker;signale;wecker;?;stellwerkobermattlangnau;#");
		map.put("9.99.04", "9.99.04;;1;sound;glocke;zug_von_emm;?;stellwerkobermattlangnau;#");
		map.put("9.99.05", "9.99.05;;1;sound;glocke;zug_von_ln;?;stellwerkobermattlangnau;#");
		map.put("9.99.06", "9.99.06;;1;sound;glocke;zug_von_zb;?;stellwerkobermattlangnau;#");
		map.put("9.99.07", "9.99.07;;1;sound;glocke;zug_nach_emm;?;stellwerkobermattlangnau;#");
		map.put("9.99.08", "9.99.08;;1;sound;glocke;zug_nach_ln;?;stellwerkobermattlangnau;#");
		map.put("9.99.09", "9.99.09;;1;sound;glocke;zug_nach_zb;?;stellwerkobermattlangnau;#");
		map.put("9.99.10", "9.99.10;i;0;lampe;stellstrom;zeiger;?;stellwerkobermattlangnau;#");
		map.put("9.99.11", "9.99.11;i;0;lampe;weichenüberw;zeiger;?;stellwerkobermattlangnau;#");
		map.put("9.99.12", "9.99.12;i;0;lampe;schienenstrom;zeiger;?;stellwerkobermattlangnau;#");
		map.put("3.01.01", "3.01.01;o;0;magnet;ws1;magnet;?;stellwerkobermattlangnau;#");
		map.put("3.04.01", "3.04.01;o;0;magnet;fssegf;sperrmagnet;?;stellwerkobermattlangnau;#");
		map.put("3.04.02", "3.04.02;o;0;magnet;fssegf;kuppelstrommagnet;?;stellwerkobermattlangnau;#");
		map.put("9.93.01", "9.93.01;i;0;;;;?;stellwerkobermattlangnau;#");
		map.put("6.90.01", "6.90.01;i;0;taste;anforderungdurchfahrt;nach_emm;?;stellwerkobermattlangnau;#");
		map.put("6.91.02", "6.91.02;i;0;taste;blockfba;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("6.91.01", "6.91.01;i;0;taste;blockfbf;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("6.91.03", "6.91.03;i;0;taste;blockrm;nach_zb;?;stellwerkobermattlangnau;#");
		map.put("6.91.04", "6.91.04;i;0;taste;blockrm;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("6.91.05", "6.91.05;i;0;taste;blockfba;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("6.91.06", "6.91.06;i;0;taste;blockfbf;nach_ln;?;stellwerkobermattlangnau;#");
		map.put("6.91.07", "6.91.07;i;0;taste;blockblu;alle_richtungen;?;stellwerkobermattlangnau;#");
		map.put("6.91.08", "6.91.08;i;0;taste;gleis;richtung_emm;?;stellwerkobermattlangnau;#");
		map.put("6.91.09", "6.91.09;i;0;taste;wecker;abschalten;?;stellwerkobermattlangnau;#");
		map.put("6.91.10", "6.91.10;i;0;taste;nottaste;weiche_1;?;stellwerkobermattlangnau;#");
		map.put("6.91.11", "6.91.11;i;0;taste;weichen;beleuchtung;?;stellwerkobermattlangnau;#");
		map.put("6.91.12", "6.91.12;i;0;taste;zeitschalter;umgehugn;?;stellwerkobermattlangnau;#");
		map.put("6.91.13", "6.91.13;i;0;taste;nal;alle_fahrstrassen;?;stellwerkobermattlangnau;#");
		map.put("6.91.14", "6.91.14;i;0;taste;gleis;richtung_zb;?;stellwerkobermattlangnau;#");
		map.put("6.91.15", "6.91.15;i;0;taste;siu;alle_fahrstrassen;?;stellwerkobermattlangnau;#");
		map.put("7.91.01", "7.91.01;i;0;schalterkontakt;ws1;endlage+;?;stellwerkobermattlangnau;#");
		map.put("7.91.02", "7.91.02;i;0;schalterkontakt;ws1;endlage+_gedrückt;?;stellwerkobermattlangnau;#");
		map.put("7.91.04", "7.91.04;i;0;schalterkontakt;ws1;endlage-;?;stellwerkobermattlangnau;#");
		map.put("8.91.02", "8.91.02;i;0;schalterkontakt;fssegf;endlage_gedrückt;?;stellwerkobermattlangnau;#");
		map.put("8.91.01", "8.91.01;i;0;schalterkontakt;fssegf;endlage;?;stellwerkobermattlangnau;#");
		map.put("8.91.03", "8.91.03;i;0;schalterkontakt;fssegf;10°f;?;stellwerkobermattlangnau;#");
		map.put("8.91.04", "8.91.04;i;0;schalterkontakt;fssegf;30°f;?;stellwerkobermattlangnau;#");
		map.put("8.91.05", "8.91.05;i;0;schalterkontakt;fssegf;45°f;?;stellwerkobermattlangnau;#");
		map.put("8.91.06", "8.91.06;i;0;schalterkontakt;fssegf;80°f;?;stellwerkobermattlangnau;#");
		map.put("8.91.07", "8.91.07;i;0;schalterkontakt;fssegf;90°f;?;stellwerkobermattlangnau;#");
		map.put("8.91.19", "8.91.19;i;0;schalterkontakt;fssegf;10°eg;?;stellwerkobermattlangnau;#");
		map.put("8.91.20", "8.91.20;i;0;schalterkontakt;fssegf;30°eg;?;stellwerkobermattlangnau;#");
		map.put("8.91.21", "8.91.21;i;0;schalterkontakt;fssegf;45°eg;?;stellwerkobermattlangnau;#");
		map.put("8.91.22", "8.91.22;i;0;schalterkontakt;fssegf;80°eg;?;stellwerkobermattlangnau;#");
		map.put("8.91.23", "8.91.23;i;0;schalterkontakt;fssegf;90°eg;?;stellwerkobermattlangnau;#");

//		map.put("10.99.01", "10.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.02", "10.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.03", "10.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.04", "10.99.04;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.05", "10.99.05;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.06", "10.99.06;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.07", "10.99.07;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.08", "10.99.08;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.09", "10.99.09;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("10.99.10", "10.99.10;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.01", "11.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.02", "11.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.03", "11.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.04", "11.99.04;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.05", "11.99.05;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.06", "11.99.06;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.07", "11.99.07;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.08", "11.99.08;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.13", "9.99.13;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.14", "9.99.14;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.15", "9.99.15;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.09", "11.99.09;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("11.99.10", "11.99.10;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.01", "9.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.02", "9.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("9.99.03", "9.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("6.99.01", "6.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("6.99.02", "6.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("6.99.03", "6.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("12.99.01", "12.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("12.99.02", "12.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("12.99.03", "12.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("12.99.04", "12.99.04;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.01", "90.99.01;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.02", "90.99.02;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.03", "90.99.03;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.04", "90.99.04;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.05", "90.99.05;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.06", "90.99.06;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.07", "90.99.07;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.08", "90.99.08;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.09", "90.99.09;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.10", "90.99.10;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.11", "90.99.11;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.12", "90.99.12;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.13", "90.99.13;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.14", "90.99.14;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.15", "90.99.15;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.16", "90.99.16;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.17", "90.99.17;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.18", "90.99.18;;1;;;;?;stellwerkobermattlangnau;#");
//		map.put("90.99.19", "90.99.19;;1;;;;?;stellwerkobermattlangnau;#");
	}


}
