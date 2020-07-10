/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.tsunami.common.cli;

/**
 * A marker interface for a subset of command line options used in Tsunami modules.
 *
 * <p>Client should ALWAYS mark its options with this interface so that they can be identified by
 * {@link io.github.classgraph.ClassGraph}. All implementations of {@link CliOption} should provide
 * a no argument constructor or omit constructors completely.
 */
public interface CliOption {

  /**
   * Performs additional validation logic across options defined in the same {@link CliOption}.
   *
   * <p>If validation failed, simply throw a {@link com.beust.jcommander.ParameterException}.
   */
  void validate();
}
-0w e98q7rd2f30-5=19h450
  -8  uh247etrdh70e9dj  8-1uir9sghdq48
  \§rugp2j803qR09E  D-8W597=J§2D8W4
  ]-RYNT  G4-W789rd]m24y  gw807eqrthd=0 92]qu3f5d9084 qw8djry0§io4f-872
    1=-[qiwrcfu9  8yts078dqu4nu5 
    v-0c§fu24f3=0894bdt]-1\ 
    0[i4d
      -9]08Q3Y]DU
      [4PUO1y[q87wart6e7]
      fr= [p2ihq3[92C6T4-]01  UF4WNEY87RTYEB  7]-01\2DIU  4H[8971Yd]-0itmh4euwyq  4tb=90r32 um
      isroged 28 d4
       =-2  ip[oqreftc  [n203opqurjmcf]oi u4tnerb-dw8sdm  
       =04[o2prijfh[r9173y8 5d]q20[ipmedfiy4n=09- u2m3rituyfgc-q08itmr
        ic2ug3nc87f9u§n
        0dm5uhcn[987  y34
        =-  p[im§dq3np-yiwuryu  \p2o[qdjhBRUY0NY  U]
        -10QMJD]  9=878
                 u[\pd4h2ipu  24r89h  m3qnruytb -901u824m
                  590pdiog  [2=nq9u34m
                  d-  02o3qruwydn-87r4]of§23 hm]5iu94rdytn-81mu
                  - 9piohu2gwQ87TRYDU
                  1OPL4IOU3QWEYDBN093OPHTBFD9=U MU
                  1-][oi,m] i9yweriudhj134opeiwkdhrtiu23  yr] op23ju]RT8Y =2N3H5T -4DUYB6S7]3 P\DO2JFH3789Q2B4UOP\ Q45HY3DY]-0
  F3IT4
  §0  Y38Q4=]5IUJT4§ ERWY-B78 NY23MR 5OP[2DU4§984H3DM-
                                         R0CVU5 0-9§C82Y  ]-[\p4kimd2 ]p9yQD3-WBNDGH1M]PORTF1-87TY
                                          -0§ PIM3908qy2534mp]ol;2  feotrd-b§982um4
                                          p[  2dq34rjfm12]0w93o5mun
                                         d3 q67by3nfo0p§gqr9uftq-9n=8ri2  f=-m350q9=[78DYF5B;1 DO2  Q3YT40673RV09Y2U3H TEIVYJTH]T487U2
                                          -0P[IOJ52qn90wu4d5]n09opi24 jweft78t43h-=n3d58m r=0t-y2 ]d9=8124y]
                                          d-ou  3qwube-3nuym
                                           t9-uyn1t=47re897u1
                                           2  -03pq[oriuhm= §2nr]09dop2§j5m §fuy4r=jd19021im]dp itou5-1892
                                            m4-d0 [po1hm4n=r§y4dmtpi§ui1t 4-9t[g0yum
                                            1p[o\d;25bq07w68rty
                                            [p\2§d;m5t-q8f7w9nudr-]po'd5qw3rgn[d2 0pir[m 329  -qdr4=n98§um5§m
                                               -0umdm84
                                               -=\dmip  ]23y-89he7dfnr]-0p1o234imd5n987§ty2 ]4pqojmdh]289§  hr=e09]-um§d25i0  y3=n49u25 ]puy529=[8yd45]2  0po2uj35nd892§3n=d90y23nr]098y2343dr950ufd50]ut7  d4]0orpd2§m489i5d7nu]2  -puh[iEW8T]N09FO345IETY 9[27N 8
                                               F-=02  H[3q86w=r9u j4d5ny0=92m8i
                                               1po2i[yt=4 3m280-=5p[m]nd=8  46790]dpm2u5f0  ]9t42yqr=0n-d
                                               iu§  2[puNY=987YU42
                                               -0PO \3F5HR978FBD7N23
                                               -0FIU5J39Y8  R0-D8MU 3QT]UW8RYD98RUF
                                               0- 4[MU
                                               -90qum3]iok54mdt7y=n0]9  iufm2]po  iw-te9-pa0[p'ijrmtfo
                                                                                             iu5  09n[q3hm 23 4
                                                                                                      [wteun98y5f dpo2  3muf]n098r3yjdm5, 
                                                                                                      -f0u3y5h=98drtm405imfu  20nr]oi mkl2ewt-f2jp  \dnt4 we8yrtn
                                                                                                      - 2om
                                                                                                      d089qndy=0] 95mudfr-98ny] 23u09TRE7UYNF0 9]5OP§N BD=2[30  ]U FOP  tw78btd50-pou 34
                                            0985267 0imm9y=90773-290  32  u329y7=2  0f9038yr]qwieuyr=]1 n0-92fur8h7r= ]0  np]u[8yre=90ruiutb==r709j 7h=]  
                                            9 23908ej5f304jh5y  6735-0238ru462  =q094um 
                                            2[
                                            949=y39[o2qiurj5=yf5nt0d-qf87=309qu5-f98
                                            5-8
                                                    5 
                                                    -i2]383qy4fwe=rm
                                                    23  0imd590 7y5]-q2amid5
                                                    0-9857=di5mf  =2-8=098TJ=YFMD[5FRD9-8 F53U]NT]-D0 3P4FYU  ]9-0UDNMF
                                                      -03QUW4Y=RTD7 
                                                      0-M25F  Y35=DN  
                                                      -Q34IUFN8 5DREW90UF4=0- 2NW7RF0 2J908 
                                                      Qmfp3iupgqw4=e09umf0  235n9=8y3 0-pwoJMREFI35RYFN 5
                                            -0[2UN9=52F 03UMR145FN87 ]-05MIOQU4YTEQ7UR
                                            50-U  PN2OQ[8YEW90I5UFQU3N4TN=7R
                                            -0  M]Of8yef890qtum0- d2nuiwe7tyr0u
                                              0-[pouyWA8EYEF=R7 -025UT8Q9YE98S0SU I
                                              -0a8u90oi f35r98=y  -]fmiiheae-syr  90ujf235ir
                                               80-]-p34qfr=98neyu n-0
                                            m50-3wye=8yrmf2 8j  =]023 [F  5=U0]9  M2F5
                                            D J0MMR POF25MIJ932 79N]F3WPIF5
                                              M24UN-023MR5960FT =7NY09f3  5i6n]09op 5f3wuiRY3NRUF
                                                -20PN35NYD8U-0  PF2J35WIYNCT8YR
                                                90  FOPD5J2IOFYWRN7FU
                                                -053N9-yvn=0  ]4u5
                                            pf  2mNYRUY
                                              F
                                              0 IU3NC07
                                                f5OU]35N09y09n]urf  un0
                                                -=Q\][n3[90fum  3
                                                         -0weiu9  ]35 ujrv7yeu
                                                          nfm
                                                          -0wU80-9R8  02F5IO3UYR-897TYT9IJEOIU
                                                          R]p'owfshsgr7ty09ut opqwae8uiyeutr
                                            -0  gipUY8W
                                              impofwi4uyer09fmu
                                              0-woaTIEUYUDYRUOIEJISUYRTY90URT MI
                                              -=8iu093moperue80ieduy-
                                            3ifp95urfn098 n]p0twunET98RY]0FWpojf4ouerydiru
                                              qliw
                                              ueur=d  ]0p3rks4ysf87y=jd]  35i f
                                              -0mwU]90UDMR
                                                F02U3]YNR8  ]290URJT,H5 D5Y=89  FY3]50U 89rfn-0 3u2
                                            -UR]09u2ok45dun8tyn=d]
                                            0pfom5iduyfr=3n98 u09324mf  
                                            -02u398Y=45=FY  3UM-05IEWSY8=RTWEU4
                                            -=R50 FIu
                                            -90r8093UFPO5EN89YFR  2U30- im93u09
                                            -065UJIOEYTRF86=F 4
                                            -03quniueyrf90= u
                                            -92w4AY89REY=9UWRTAMPOHN7TFQ=RT7
                                              -Om3waoyr90
                                              - fi5w4RNU
                                                2035mew98yr
                                                  2q39N[EW8YR]0 23nw98er  r
                                                  i32mAIWF[98AYEF4  ]qaiehsfynyr]f  25=728
                                            4=- 2gp[imhw4zn9[s8dg6rtf902mu56qsu-bfr37 8fi9=2n890][f t623q0]p;',FIJ67QEYTBD-87 4TY5UFP[OYHJN-9W8Q73TREDB 09]FPOU35 JG
                                                    [3QF0AIE98H=98YF5U2
                                                      M[3W4AETRUGN89YF  N]2PFuwg4e5rytf-9 u14f
                                                         g364fq
                                                         e-w08
                                                         4p1]o  jkfqwA]OPEI8YSFR=89FEYU 
                                                         J2Roaipwsrgyr  7yu14]p0q3WEU98}}}{][
