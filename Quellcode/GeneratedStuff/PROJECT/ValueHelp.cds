@AbapCatalog.enhancement.category : #NOT_EXTENSIBLE
extend type cfd_s_prj_project_ext_incl_ps with yy1_mathis_extend {

  yy1_mathiscdscodecid_zpj : abap.char(3);
  yy1_mathiscdscoderid_zpj : abap.char(3);

}

YY1_MATHISCDSCODECID
Domain: YY1_MATHISCDSCODECID
Data Type: CHAR
Length: 3

YY1_MATHISCDSCODERID
Domain: YY1_MATHISCDSCODERID
Data Type: CHAR
Length: 3

YY1_MATHISCDSCODERID_D
Domain: YY1_MATHISCDSCODERID_D
Data Type: CHAR
Length: 20

YY1_MATHISCDSCODECID
Data Type: CHAR
Length: 3

YY1_MATHISCDSCODERID
Data Type: CHAR
Length: 3

YY1_MATHISCDSCODERID_D
Data Type: CHAR
Length: 20

extend view entity C_CFD_PRJ_PROJECT_TP_INTF with

{
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Country'
  }, additionalBinding: [{
    element: 'Region',
    localElement: 'YY1_MathisCDSCodeRID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  Project.YY1_MathisCDSCodeCID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Region'
  }, additionalBinding: [{
    element: 'Country',
    localElement: 'YY1_MathisCDSCodeCID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  Project.YY1_MathisCDSCodeRID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  Project._YY1_MathisCDSCode_ZPJ
}

extend view entity I_CFD_PRJ_PROJECT_TP with

{
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Country'
  }, additionalBinding: [{
    element: 'Region',
    localElement: 'YY1_MathisCDSCodeRID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  Project.YY1_MathisCDSCodeCID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Region'
  }, additionalBinding: [{
    element: 'Country',
    localElement: 'YY1_MathisCDSCodeCID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  Project.YY1_MathisCDSCodeRID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  Project._YY1_MathisCDSCode_ZPJ
}

extend view entity R_CFD_PRJ_PROJECT_TP with
    association [0..1] to I_REGIONVH as _YY1_MathisCDSCode_ZPJ
  on  $projection.YY1_MathisCDSCodeCID_ZPJ = _YY1_MathisCDSCode_ZPJ.Country
  and $projection.YY1_MathisCDSCodeRID_ZPJ = _YY1_MathisCDSCode_ZPJ.Region

{
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Country'
  }, additionalBinding: [{
    element: 'Region',
    localElement: 'YY1_MathisCDSCodeRID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  _Extension.YY1_MATHISCDSCODECID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Region'
  }, additionalBinding: [{
    element: 'Country',
    localElement: 'YY1_MathisCDSCodeCID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  _Extension.YY1_MATHISCDSCODERID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  _YY1_MathisCDSCode_ZPJ
}

extend view entity R_CFD_PRJ_PROJECTDRAFT with
    association [0..1] to I_REGIONVH as _YY1_MathisCDSCode_ZPJ
  on  $projection.YY1_MathisCDSCodeCID_ZPJ = _YY1_MathisCDSCode_ZPJ.Country
  and $projection.YY1_MathisCDSCodeRID_ZPJ = _YY1_MathisCDSCode_ZPJ.Region

{
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Country'
  }, additionalBinding: [{
    element: 'Region',
    localElement: 'YY1_MathisCDSCodeRID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  _Extension.YY1_MATHISCDSCODECID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
@Consumption.valueHelpDefinition: [{
  entity: {
    name: 'I_REGIONVH',
    element: 'Region'
  }, additionalBinding: [{
    element: 'Country',
    localElement: 'YY1_MathisCDSCodeCID_ZPJ'
  }]
}]
@UI.textArrangement: #TEXT_FIRST
  _Extension.YY1_MATHISCDSCODERID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  _YY1_MathisCDSCode_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT with
    association [0..1] to I_REGIONVH as _YY1_MathisCDSCode_ZPJ
  on  $projection.YY1_MathisCDSCodeCID_ZPJ = _YY1_MathisCDSCode_ZPJ.Country
  and $projection.YY1_MathisCDSCodeRID_ZPJ = _YY1_MathisCDSCode_ZPJ.Region

{
  Persistence.YY1_MATHISCDSCODECID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
  Persistence.YY1_MATHISCDSCODERID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  _YY1_MathisCDSCode_ZPJ
}

extend view entity E_CFD_PRJ_PROJECT_D with
    association [0..1] to I_REGIONVH as _YY1_MathisCDSCode_ZPJ
  on  $projection.YY1_MathisCDSCodeCID_ZPJ = _YY1_MathisCDSCode_ZPJ.Country
  and $projection.YY1_MathisCDSCodeRID_ZPJ = _YY1_MathisCDSCode_ZPJ.Region

{
  Persistence.YY1_MATHISCDSCODECID_ZPJ as YY1_MathisCDSCodeCID_ZPJ,
  Persistence.YY1_MATHISCDSCODERID_ZPJ as YY1_MathisCDSCodeRID_ZPJ,
  _YY1_MathisCDSCode_ZPJ
}