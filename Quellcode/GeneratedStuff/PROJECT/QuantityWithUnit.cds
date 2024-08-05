@AbapCatalog.enhancement.category : #NOT_EXTENSIBLE
extend type cfd_s_prj_project_ext_incl_ps with yy1_mathis_extend {

  yy1_mathisamount_zpj : abap.quan(15);
  yy1_mathisamount_zpjc : abap.unit(3);

}

YY1:MATHISQUANTITY
Domain: MENGV8
Data Type: QUAN
Length: 15
Decimals: 3

YY1:MATHISQUANTITY_C
Domain: MEINS
Data Type: UNIT
Length: 3

YY1:MATHISQUANTITY_D
Domain: TEXT10
Data Type: CHAR
Length: 10

extend view entity C_CFD_PRJ_PROJECT_TP_INTF with

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  Project.YY1_MathisQuantity_ZPJ as YY1_MathisQuantity_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_UNITOFMEASURE',
    element: 'UnitOfMeasure'
  }
}]
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  Project.YY1_MathisQuantity_ZPJU as YY1_MathisQuantity_ZPJU,
  Project._YY1_MathisQuantity_ZPJ
}

extend view entity I_CFD_PRJ_PROJECT_TP with

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  Project.YY1_MathisQuantity_ZPJ as YY1_MathisQuantity_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_UNITOFMEASURE',
    element: 'UnitOfMeasure'
  }
}]
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  Project.YY1_MathisQuantity_ZPJU as YY1_MathisQuantity_ZPJU,
  Project._YY1_MathisQuantity_ZPJ
}

extend view entity R_CFD_PRJ_PROJECT_TP with
    association [0..1] to I_UNITOFMEASURE as _YY1_MathisQuantity_ZPJ
  on  $projection.YY1_MathisQuantity_ZPJU = _YY1_MathisQuantity_ZPJ.UnitOfMeasure

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  _Extension.YY1_MATHISQUANTITY_ZPJ as YY1_MathisQuantity_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  _Extension.YY1_MATHISQUANTITY_ZPJU as YY1_MathisQuantity_ZPJU,
  _YY1_MathisQuantity_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT with
    association [0..1] to I_UNITOFMEASURE as _YY1_MathisQuantity_ZPJ
  on  $projection.YY1_MathisQuantity_ZPJU = _YY1_MathisQuantity_ZPJ.UnitOfMeasure

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  Persistence.YY1_MATHISQUANTITY_ZPJ as YY1_MathisQuantity_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  Persistence.YY1_MATHISQUANTITY_ZPJU as YY1_MathisQuantity_ZPJU,
  _YY1_MathisQuantity_ZPJ
}

extend view entity R_CFD_PRJ_PROJECTDRAFT with
    association [0..1] to I_UNITOFMEASURE as _YY1_MathisQuantity_ZPJ
  on  $projection.YY1_MathisQuantity_ZPJU = _YY1_MathisQuantity_ZPJ.UnitOfMeasure

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  _Extension.YY1_MATHISQUANTITY_ZPJ as YY1_MathisQuantity_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  _Extension.YY1_MATHISQUANTITY_ZPJU as YY1_MathisQuantity_ZPJU,
  _YY1_MathisQuantity_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT_D with
    association [0..1] to I_UNITOFMEASURE as _YY1_MathisQuantity_ZPJ
  on  $projection.YY1_MathisQuantity_ZPJU = _YY1_MathisQuantity_ZPJ.UnitOfMeasure

{
@Semantics.quantity.unitOfMeasure: 'YY1_MathisQuantity_ZPJU'
  Persistence.YY1_MATHISQUANTITY_ZPJ as YY1_MathisQuantity_ZPJ,
@ObjectModel.foreignKey.association: '_YY1_MathisQuantity_ZPJ'
  Persistence.YY1_MATHISQUANTITY_ZPJU as YY1_MathisQuantity_ZPJU,
  _YY1_MathisQuantity_ZPJ
}