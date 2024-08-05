PUBLIC SECTION.
  TYPES: tt_node TYPE TABLE OF REF TO cl_rap_ext_node.
  CLASS-DATA: mt_nodes TYPE tt_node.
  CLASS-METHODS:
    start_dfs_rec_det_post
      IMPORTING iv_node  TYPE REF TO cl_rap_ext_node
      EXPORTING et_nodes TYPE tt_node.
PRIVATE SECTION.
  CLASS-METHODS:
    dfs_rec_det_post
      IMPORTING iv_node TYPE REF TO cl_rap_ext_node.

METHOD start_dfs_rec_det_post.
  CLEAR mt_nodes.
  dfs_rec_det_post( iv_node = iv_node ).
  et_nodes = mt_nodes.
ENDMETHOD.

METHOD dfs_rec_det_post.
  IF iv_node->mt_children IS NOT INITIAL.
    LOOP AT iv_node->mt_children INTO DATA(lo_child).
      dfs_rec_det_post( iv_node = lo_child ).
    ENDLOOP.
  ENDIF.
  APPEND iv_node TO mt_nodes.
ENDMETHOD.