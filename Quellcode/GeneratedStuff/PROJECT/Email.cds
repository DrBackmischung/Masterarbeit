@AbapCatalog.enhancement.category : #NOT_EXTENSIBLE
extend type cfd_s_prj_project_ext_incl_ps with yy1_mathis_extend {

  yy1_mathistext_zpj : abap.char(20);

}

extend view entity C_CFD_PRJ_PROJECT_TP_INTF with

{
  @Semantics.eMail.address: true
  Project.YY1_MathisText_ZPJ as YY1_MathisText_ZPJ
}

extend view entity I_CFD_PRJ_PROJECT_TP with

{
  @Semantics.eMail.address: true
  Project.YY1_MathisText_ZPJ as YY1_MathisText_ZPJ
}

extend view entity R_CFD_PRJ_PROJECT_TP with

{
  @Semantics.eMail.address: true
  _Extension.YY1_MATHISTEXT_ZPJ as YY1_MathisText_ZPJ
}

extend view entity R_CFD_PRJ_PROJECTDRAFT with

{
  @Semantics.eMail.address: true
  _Extension.YY1_MATHISTEXT_ZPJ as YY1_MathisText_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT with

{
  @Semantics.eMail.address: true
  Persistence.YY1_MATHISTEXT_ZPJ as YY1_MathisText_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT_D with

{
  @Semantics.eMail.address: true
  Persistence.YY1_MATHISTEXT_ZPJ as YY1_MathisText_ZPJ
}