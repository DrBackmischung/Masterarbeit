@AbapCatalog.enhancement.category : #NOT_EXTENSIBLE
extend type cfd_s_prj_project_ext_incl_ps with yy1_mathis_extend {

  yy1_mathisamount_zpj : abap.curr(15);
  yy1_mathisamount_zpjc : abap.cuky(5);

}

YY1:MATHISAMOUNT
Domain: CFD_CUSTOM_AMOUNT
Data Type: CURR
Length: 15
Decimals: 2

YY1:MATHISAMOUNT_C
Domain: WAERS
Data Type: CUKY
Length: 5

YY1:MATHISAMOUNT_D
Domain: TEXT15
Data Type: CHAR
Length: 15

extend view entity E_CFD_PRJ_PROJECT_D with
    association [0..1] to I_CURRENCY as _YY1_MathisAmount_ZPJ
  on  $projection.YY1_MathisAmount_ZPJC = _YY1_MathisAmount_ZPJ.Currency

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  Persistence.YY1_MATHISAMOUNT_ZPJ as YY1_MathisAmount_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  Persistence.YY1_MATHISAMOUNT_ZPJC as YY1_MathisAmount_ZPJC,
  _YY1_MathisAmount_ZPJ
}

extend view entity R_CFD_PRJ_PROJECTDRAFT with
    association [0..1] to I_CURRENCY as _YY1_MathisAmount_ZPJ
  on  $projection.YY1_MathisAmount_ZPJC = _YY1_MathisAmount_ZPJ.Currency

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  _Extension.YY1_MATHISAMOUNT_ZPJ as YY1_MathisAmount_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  _Extension.YY1_MATHISAMOUNT_ZPJC as YY1_MathisAmount_ZPJC,
  _YY1_MathisAmount_ZPJ
}

extend view entity I_CFD_PRJ_PROJECT_TP with

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  Project.YY1_MathisAmount_ZPJ as YY1_MathisAmount_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_CURRENCY',
    element: 'Currency'
  }
}]
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  Project.YY1_MathisAmount_ZPJC as YY1_MathisAmount_ZPJC,
  Project._YY1_MathisAmount_ZPJ
}

extend view entity C_CFD_PRJ_PROJECT_TP_INTF with

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  Project.YY1_MathisAmount_ZPJ as YY1_MathisAmount_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_CURRENCY',
    element: 'Currency'
  }
}]
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  Project.YY1_MathisAmount_ZPJC as YY1_MathisAmount_ZPJC,
  Project._YY1_MathisAmount_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT with
    association [0..1] to I_CURRENCY as _YY1_MathisAmount_ZPJ
  on  $projection.YY1_MathisAmount_ZPJC = _YY1_MathisAmount_ZPJ.Currency

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  Persistence.YY1_MATHISAMOUNT_ZPJ as YY1_MathisAmount_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  Persistence.YY1_MATHISAMOUNT_ZPJC as YY1_MathisAmount_ZPJC,
  _YY1_MathisAmount_ZPJ
}

extend view entity R_CFD_PRJ_PROJECT_TP with
    association [0..1] to I_CURRENCY as _YY1_MathisAmount_ZPJ
  on  $projection.YY1_MathisAmount_ZPJC = _YY1_MathisAmount_ZPJ.Currency

{
@Semantics.amount.currencyCode: 'YY1_MathisAmount_ZPJC'
  _Extension.YY1_MATHISAMOUNT_ZPJ as YY1_MathisAmount_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisAmount_ZPJ'
  _Extension.YY1_MATHISAMOUNT_ZPJC as YY1_MathisAmount_ZPJC,
  _YY1_MathisAmount_ZPJ
}