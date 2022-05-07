import React, { memo } from 'react'
import PropTypes from 'prop-types'
import { Grid, Skeleton } from '../../../components'
import Card from './Card'

function Board({ data }) {
  const { cases, todayDeaths, recovered, deaths, todayCases, casesPerOneMillion } = data

  const getValue = (value) => value ? value : <Skeleton variant="text" width={182} height={60} />

  function formatValor(number) {
    return number.toLocaleString('pt-BR')
  }


  return (
    <Grid container spacing={4}>
      <Grid item xs={12} md={4}>
        <Card value={getValue(cases.toLocaleString('pt-br'))} label="Total de casos" color="#F7B829" />
      </Grid>
      <Grid item xs={12} md={4}>
        <Card value={getValue(todayDeaths.toLocaleString('pt-br'))} label="Óbitos do dia" color="#E95078" />
      </Grid>
      <Grid item xs={12} md={4}>
        <Card value={getValue(todayCases.toLocaleString('pt-br'))} label="Casos do dia" color="#5d78ff" />
      </Grid>
      <Grid item xs={12} md={4}>
        <Card value={getValue(deaths.toLocaleString('pt-br'))} label="Total de Óbitos" color="#000" />
      </Grid>
      <Grid item xs={12} md={4}>
        <Card value={getValue(recovered.toLocaleString('pt-br'))} label="Total de recuperados" color="#67C887" />
      </Grid>
      <Grid item xs={12} md={4}>
        <Card value={getValue(casesPerOneMillion.toLocaleString('pt-br'))} label="Casos por Milhão" color="#67C887" />
      </Grid>
    </Grid>
  )
}

export default memo(Board)